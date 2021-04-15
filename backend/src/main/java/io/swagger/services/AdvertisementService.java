package io.swagger.services;

import io.swagger.entities.Advertisement;
import io.swagger.model.AdvertisementCreationDTO;
import io.swagger.repositories.AdvertisementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvertisementService {

	private final AdvertisementRepository advertisementRepository;

	public Advertisement createAdvertisement(AdvertisementCreationDTO adDTO) {
		Advertisement ad = new Advertisement();
		ad.setOfferType(adDTO.getOfferType());
		ad.setTitle(adDTO.getTitle());
		ad.setDescription(adDTO.getDescription());
		ad.setEmail(adDTO.getEmail());
		ad.setPhone(adDTO.getPhone());
		return advertisementRepository.save(ad);
	}

	public List<Advertisement> getAllAdvertisements() {
		return advertisementRepository.findAll();
	}

}
