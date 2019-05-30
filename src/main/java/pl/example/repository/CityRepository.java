package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.CityEntity;


public interface CityRepository extends CrudRepository<CityEntity, Long> {
}
