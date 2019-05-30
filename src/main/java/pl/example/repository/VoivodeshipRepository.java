package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.VoivodeshipEntity;


public interface VoivodeshipRepository extends CrudRepository<VoivodeshipEntity, Long> {
}
