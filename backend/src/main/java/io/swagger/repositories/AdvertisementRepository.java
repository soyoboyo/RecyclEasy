package io.swagger.repositories;

import io.swagger.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertisementRepository extends JpaRepository<Place, Long> {
}
