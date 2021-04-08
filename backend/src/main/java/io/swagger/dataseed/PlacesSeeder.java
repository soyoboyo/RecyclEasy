package io.swagger.dataseed;

import io.swagger.entities.Place;
import io.swagger.repositories.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlacesSeeder {
	private final PlaceRepository placeRepository;

	public void initPlaces() {
		Place p1 = new Place();
		p1.setName("");
		placeRepository.save(p1);
	}


}
