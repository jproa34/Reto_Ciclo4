package Reto1.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import Reto1.model.Vegetarian;
import Reto1.service.VegetarianService;

/**
 * @author Juan Pablo RoA
 */
@RestController
@RequestMapping("/api/vegetarian")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class VegetarianController {

    @Autowired
    private VegetarianService productService;

    @GetMapping("/all")
    public List<Vegetarian> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Vegetarian> getCleaningProduct(@PathVariable("reference") String reference) {
        return productService.getCleaningProducts(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Vegetarian gadget){
        productService.save(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Vegetarian update(@RequestBody Vegetarian gadget){
        return productService.save(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference){
        return productService.delete(reference);
    }


}
