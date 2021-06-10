package io.swagger.services;

import io.swagger.DTOs.PlaceCreationDTO;
import io.swagger.entities.Place;
import io.swagger.repositories.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaceService {

	private final PlaceRepository placeRepository;


	public Place createAdvertisement(PlaceCreationDTO pDTO) {
		Place p = new Place();
		p.setName(pDTO.getName());
		p.setAddress(pDTO.getAddress());
		p.setLatitude(pDTO.getLatitude());
		p.setLongitude(pDTO.getLongitude());
		return placeRepository.save(p);
	}

	public List<Place> getAllPlaces() {
		return placeRepository.findAll();
	}

	public void deletePlace(Long id) {
		Optional<Place> p = placeRepository.findById(id);
		p.ifPresent(placeRepository::delete);
	}

	public List<Place> getAllPlacesByCityAndGarbageType(String city, String garbageTypes) {

		List<Place> allPlacesInCity = placeRepository.findByCity(city);
		for (Place p : allPlacesInCity) {

		}
		return new ArrayList<>();
	}


}
