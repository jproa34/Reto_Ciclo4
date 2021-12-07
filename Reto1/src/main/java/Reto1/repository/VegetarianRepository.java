package Reto1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Reto1.model.Vegetarian;
import Reto1.repository.crud.InterfaceVegetarian;

/**
 * @author Juan Pablo Roa
 */

@Repository
public class VegetarianRepository {
    @Autowired
    private InterfaceVegetarian productCrudRepository;

    public List<Vegetarian> getAll(){
        return productCrudRepository.findAll();
    }

    public  Optional<Vegetarian> getProduct(String id){
        return productCrudRepository.findById(id);
    }

    public Vegetarian create(Vegetarian product){
        return productCrudRepository.save(product);
    }

    public void update(Vegetarian product){
        productCrudRepository.save(product);
    }

    public void delete(Vegetarian product){
        productCrudRepository.delete(product);
    }
}
