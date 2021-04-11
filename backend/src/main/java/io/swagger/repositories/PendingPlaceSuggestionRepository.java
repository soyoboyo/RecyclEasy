package io.swagger.repositories;

import io.swagger.entities.PendingPlaceSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PendingPlaceSuggestionRepository extends JpaRepository<PendingPlaceSuggestion, Long> {
}
