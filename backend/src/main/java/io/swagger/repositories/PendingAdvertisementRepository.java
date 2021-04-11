package io.swagger.repositories;

import io.swagger.entities.PendingAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PendingAdvertisementRepository extends JpaRepository<PendingAdvertisement, Long> {
}
