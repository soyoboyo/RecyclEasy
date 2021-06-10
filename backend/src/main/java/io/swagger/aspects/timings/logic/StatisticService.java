package io.swagger.aspects.timings.logic;


import io.swagger.aspects.timings.models.AggregatedTimingStatistics;
import io.swagger.aspects.timings.models.Statistic;
import io.swagger.aspects.timings.models.StatisticResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.StreamSupport;

@Service
public class StatisticService {

	private final StatisticsRepository statisticsRepository;

	public StatisticService(StatisticsRepository statisticsRepository) {
		this.statisticsRepository = statisticsRepository;
	}

	public void saveInvocation(String className, String methodName, long duration) {
		Statistic statistic = new Statistic(duration, className, methodName);
		statisticsRepository.save(statistic);
	}

	public List<AggregatedTimingStatistics> getAggregatedStatistics() {
		Iterable<Statistic> statistics = statisticsRepository.findAll();

		Map<String, AggregatedTimingStatistics> aggregatedStatistics = new HashMap<>();

		StreamSupport.stream(statistics.spliterator(), false)
				.forEach(statistic -> {
					createUniqueStatisticIfNotExists(aggregatedStatistics, statistic);
					updateAggregatedStatistic(aggregatedStatistics, statistic);
				});

		countAverageDurations(aggregatedStatistics);

		return new ArrayList<>(aggregatedStatistics.values());
	}

	private void createUniqueStatisticIfNotExists(Map<String, AggregatedTimingStatistics> aggregatedStatistics, Statistic statistic) {
		if (!aggregatedStatistics.containsKey(statistic.getFullName())) {
			aggregatedStatistics.put(statistic.getFullName(), new AggregatedTimingStatistics(statistic.getClassName(), statistic.getMethodName()));
		}
	}

	private void updateAggregatedStatistic(Map<String, AggregatedTimingStatistics> aggregatedStatistics, Statistic statistic) {
		AggregatedTimingStatistics aggregatedTimingStatistics = aggregatedStatistics.get(statistic.getFullName());
		aggregatedTimingStatistics.setCallCount(aggregatedTimingStatistics.getCallCount() + 1);
		StatisticResponse statisticResponse = new StatisticResponse(statistic.getTimestamp(), statistic.getDuration());
		aggregatedTimingStatistics.addStatistic(statisticResponse);
	}

	private void countAverageDurations(Map<String, AggregatedTimingStatistics> aggregatedStatistic) {
		for (Map.Entry<String, AggregatedTimingStatistics> statisticEntry : aggregatedStatistic.entrySet()) {
			long allElapsedTimes = statisticEntry.getValue().getStatistics().stream()
					.map(StatisticResponse::getExecutionTime)
					.mapToLong(Long::longValue).sum();
			long occurrences = statisticEntry.getValue().getStatistics().size();
			statisticEntry.getValue().setAverageExecutionTime(allElapsedTimes / occurrences);
		}
	}

}
