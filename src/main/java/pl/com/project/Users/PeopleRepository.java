package pl.com.project.Users;

import org.springframework.data.repository.CrudRepository;
import pl.com.project.Users.Person;

public interface PeopleRepository extends CrudRepository<Person, Long> {
}
