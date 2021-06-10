package io.swagger.aspects.garbage;

import io.swagger.aspects.garbage.logic.GarbageStatisticService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GarbageAspect {

	private final GarbageStatisticService garbageStatisticService;

	public GarbageAspect(GarbageStatisticService garbageStatisticService) {
		this.garbageStatisticService = garbageStatisticService;
	}

	@Around("execution(* io.swagger.services.PlaceService.getAllPlacesByCityAndGarbageType(..))")
	public Object trackGarbageTypes(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		Object[] args = proceedingJoinPoint.getArgs();

		String city = (String) args[0];
		String garbageTypes = (String) args[1];

		Object proceed = proceedingJoinPoint.proceed(args);

		garbageStatisticService.saveInvocation(city, garbageTypes);

		return proceed;
	}
}
