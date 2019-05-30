package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.MeetingEntity;


public interface MeetingRepository extends CrudRepository<MeetingEntity, Long> {
}
