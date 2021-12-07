package Reto1.repository;

import Reto1.repository.crud.InterfaceUser;
import Reto1.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Juan Pablo Roa
 */
@Repository
public class UserRepository {
    @Autowired
    private InterfaceUser interfaceUser;

    public List<User> getAll() {
        return (List<User>) interfaceUser.findAll();
    }

    public Optional<User> getUser(int id) {
        return interfaceUser.findById(id);
    }

    public User save(User user) {
        return interfaceUser.save(user);
    }

    public void update(User user){
        interfaceUser.save(user);
    }

    public void delete(User user){
        interfaceUser.delete(user);
    }

    public boolean emailExists(String email) {
        Optional<User> user = interfaceUser.findByEmail(email);
        return user.isPresent();
    }

    public Optional<User> authenticateUser(String email, String password){
        return interfaceUser.findByEmailAndPassword(email, password);
    }

}
 
