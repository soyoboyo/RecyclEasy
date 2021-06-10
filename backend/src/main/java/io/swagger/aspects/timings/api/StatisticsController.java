package io.swagger.aspects.timings.api;


import io.swagger.aspects.timings.logic.StatisticService;
import io.swagger.aspects.timings.models.AggregatedTimingStatistics;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/timing-stats")
public class StatisticsController implements TimingStatisticsApi {

	private final StatisticService statisticService;

	public StatisticsController(StatisticService statisticService) {
		this.statisticService = statisticService;
	}

	@Override
	public ResponseEntity<List<AggregatedTimingStatistics>> getStatistics() {
		return ResponseEntity.ok(statisticService.getAggregatedStatistics());
	}

}
