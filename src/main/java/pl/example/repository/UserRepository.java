package pl.example.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.example.models.UserrEntity;

@Repository
public interface UserRepository extends CrudRepository<UserrEntity, Integer> {
    UserrEntity findByEmail(String email);
    Boolean existsByEmail(String email);
}
