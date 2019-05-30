package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
