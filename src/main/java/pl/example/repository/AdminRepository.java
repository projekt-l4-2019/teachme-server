package pl.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.AdminnEntity;

@Repository
public interface AdminRepository extends CrudRepository<AdminnEntity, Integer> {
}
