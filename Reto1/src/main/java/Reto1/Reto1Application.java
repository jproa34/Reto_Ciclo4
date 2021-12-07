   
package Reto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import Reto1.repository.crud.InterfaceUser;
import Reto1.repository.crud.InterfaceVegetarian;


/**
 * @author Juan Pablo Roa
 */

@Component
@SpringBootApplication
public class Reto1Application implements CommandLineRunner {
   @Autowired
    private InterfaceVegetarian interfaceChocolate;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll();
    }
    
}