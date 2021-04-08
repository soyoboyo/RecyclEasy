package io.swagger.dataseed;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Service
public class MainSeeder {
	private final PlacesSeeder placesSeeder;


	@Transactional
	@PostConstruct
	public void init() {
		placesSeeder.initPlaces();
	}
}
