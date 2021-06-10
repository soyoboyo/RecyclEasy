package io.swagger.aspects.garbage.logic;


import io.swagger.aspects.garbage.models.AggregatedCityStatistic;
import io.swagger.aspects.garbage.models.GarbageStatistic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarbageStatisticService {

	private final GarbageStatisticRepository statisticsRepository;

	public GarbageStatisticService(GarbageStatisticRepository statisticsRepository) {
		this.statisticsRepository = statisticsRepository;
	}

	public void saveInvocation(String city, String garbageTypes) {
		GarbageStatistic statistic = new GarbageStatistic(city, garbageTypes);
		statisticsRepository.save(statistic);
	}

	public List<AggregatedCityStatistic> getCountForCity() {
		return null;
	}

	public void getGarbageTypeCountForCity() {

	}

}
