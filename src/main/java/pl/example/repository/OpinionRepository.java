package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.OpinionEntity;

@Repository
public interface OpinionRepository extends CrudRepository<OpinionEntity, Long> {
}
