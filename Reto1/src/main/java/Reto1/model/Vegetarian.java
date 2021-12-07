package Reto1.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Juan Pablo Roa
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "vegetarians")
public class Vegetarian {

    @Id
    private String reference;
    private String brand;
    private String category;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
