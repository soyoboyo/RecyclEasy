package io.swagger.aspects.garbage.api;


import io.swagger.aspects.garbage.logic.GarbageStatisticService;
import io.swagger.aspects.garbage.models.AggregatedCityStatistic;
import io.swagger.aspects.garbage.models.AggregatedGarbageTypeStatistic;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/garbage-stats")
public class GarbageGarbageStatisticsController implements GarbageStatisticsApi {

	private final GarbageStatisticService garbageStatisticService;

	public GarbageGarbageStatisticsController(GarbageStatisticService garbageStatisticService) {
		this.garbageStatisticService = garbageStatisticService;
	}

	@Override
	public ResponseEntity<List<AggregatedCityStatistic>> getCityStatistics() {
		return ResponseEntity.ok(garbageStatisticService.getCountForCity());
	}

	public ResponseEntity<List<AggregatedGarbageTypeStatistic>> getGarbageTypeStatistic() {
		return null;
	}

}
