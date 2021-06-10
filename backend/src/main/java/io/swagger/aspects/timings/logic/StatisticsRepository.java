package io.swagger.aspects.timings.logic;


import io.swagger.aspects.timings.models.Statistic;
import org.springframework.data.repository.CrudRepository;

public interface StatisticsRepository extends CrudRepository<Statistic, Long> {
}
