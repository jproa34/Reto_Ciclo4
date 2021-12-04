package Reto1.repository.crud;

import Reto1.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Juan Pablo Roa Fragozo
 */

public interface UserCrudRepository extends CrudRepository <User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
