package Reto1.repository.crud;


import org.springframework.data.mongodb.repository.MongoRepository;
import Reto1.model.Vegetarian;

/**
 * @author Juan Pablo Roa
 */
public interface InterfaceVegetarian extends MongoRepository<Vegetarian, String>{
    
}
