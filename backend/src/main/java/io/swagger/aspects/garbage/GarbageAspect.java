package io.swagger.aspects.garbage;

import io.swagger.aspects.garbage.logic.GarbageStatisticService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GarbageAspect {

	private final GarbageStatisticService garbageStatisticService;

	public GarbageAspect(GarbageStatisticService garbageStatisticService) {
		this.garbageStatisticService = garbageStatisticService;
	}

}
