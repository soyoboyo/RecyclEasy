package io.swagger.aspects.garbage.logic;


import io.swagger.aspects.garbage.models.GarbageStatistic;
import org.springframework.data.repository.CrudRepository;

public interface GarbageStatisticRepository extends CrudRepository<GarbageStatistic, Long> {
}
