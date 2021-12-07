package Reto1.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Juan Pablo Roa
 */
@Document(collection = "users")
@Data //Dependencia para no utilizar getters y setters
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;
    private String identification;
    private String name;
    private String address;
    private String cellPhone;
    private String email;
    private String password;
    private String zone;
    private String type;
    
}