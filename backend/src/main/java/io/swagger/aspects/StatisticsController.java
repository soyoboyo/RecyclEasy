package io.swagger.aspects;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stats")
public class StatisticsController implements StatisticsApi {

	private final StatisticService statisticService;

	public StatisticsController(StatisticService statisticService) {
		this.statisticService = statisticService;
	}

	@Override
	public ResponseEntity<List<AggregatedStatistic>> getStatistics() {
		return ResponseEntity.ok(statisticService.getAggregatedStatistics());
	}

}
