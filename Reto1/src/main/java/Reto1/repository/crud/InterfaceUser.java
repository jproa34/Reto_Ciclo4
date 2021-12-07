package Reto1.repository.crud;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import Reto1.model.User;

/**
 * @author Juan Pablo Roa Fragozo
 */

public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByNameOrEmail(String name, String email);
}