package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.UserrEntity;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserrEntity, Integer> {
UserrEntity findByEmail(String email);
Boolean existsByEmail(String email);
}
