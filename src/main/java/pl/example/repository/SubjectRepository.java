package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import pl.example.models.SubjectEntity;

public interface SubjectRepository extends CrudRepository<SubjectEntity, Long> {
}
