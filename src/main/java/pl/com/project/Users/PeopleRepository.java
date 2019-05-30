package pl.com.project.Users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.com.project.Users.Person;

@Repository
public interface PeopleRepository extends CrudRepository<Person, Long> {
    Person findByEmail(String principalId);
}
