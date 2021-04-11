package io.swagger.repositories;

import io.swagger.entities.PendingPlaceSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PendingPlaceSuggestionRepository extends JpaRepository<PendingPlaceSuggestion, Long> {
}
