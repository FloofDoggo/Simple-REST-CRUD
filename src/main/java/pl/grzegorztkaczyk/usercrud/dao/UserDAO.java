package pl.grzegorztkaczyk.usercrud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.grzegorztkaczyk.usercrud.dao.domain.User;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {
}
