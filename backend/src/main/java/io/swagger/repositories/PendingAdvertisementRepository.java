package io.swagger.repositories;

import io.swagger.entities.PendingAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PendingAdvertisementRepository extends JpaRepository<PendingAdvertisement, Long> {
}
