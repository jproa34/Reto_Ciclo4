package Reto1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Reto1.model.Vegetarian;
import Reto1.repository.VegetarianRepository;

/**
 * @author Juan Pablo Roa
 */


@Service
public class VegetarianService {
    @Autowired
    private VegetarianRepository productRepository;

    public List<Vegetarian> getAll(){
        return productRepository.getAll();
    }

    public Optional<Vegetarian> getCleaningProducts(String reference){
        return productRepository.getProduct(reference);
    }

    public Vegetarian save(Vegetarian cleaningProduct){
        if(cleaningProduct.getReference() == null) {
            return cleaningProduct;
        }else{
            return productRepository.create(cleaningProduct);
        }
    }

    public Vegetarian update(Vegetarian product) {

        if (product.getReference() != null) {
            Optional<Vegetarian> dbProduct = productRepository.getProduct(product.getReference());
            if (!dbProduct.isEmpty()) {
                if (product.getBrand() != null) {
                    dbProduct.get().setBrand(product.getBrand());
                }
                if (product.getCategory() != null) {
                    dbProduct.get().setCategory(product.getCategory());
                }
                if (product.getDescription() != null) {
                    dbProduct.get().setDescription(product.getDescription());
                }
                if (product.getPrice() != 0.0) {
                    dbProduct.get().setPrice(product.getPrice());
                }
                if (product.getPrice() != 0.0) {
                    dbProduct.get().setPrice(product.getPrice());
                }
                if (product.getQuantity() != 0) {
                    dbProduct.get().setQuantity(product.getQuantity());
                }
                if (product.getPhotography() != null) {
                    dbProduct.get().setPhotography(product.getPhotography());
                }
                dbProduct.get().setAvailability(product.isAvailability());
                productRepository.update(dbProduct.get());
                return dbProduct.get();
            } else {
                return product;
            }
        }else{
            return product;
        }
    }

    public boolean delete(String reference){
        Boolean aboolean= getCleaningProducts(reference).map(cleaningProduct -> {
            productRepository.delete(cleaningProduct);
            return true;
        }).orElse(false);
        return aboolean;
    }    
}
