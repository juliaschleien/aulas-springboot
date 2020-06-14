package julia.schleien.exemploinjecaodedependecia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Julia Schleien
 */
@SpringBootApplication
public class ExemploInjecaoDeDependeciaApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(ExemploInjecaoDeDependeciaApplication.class, args);

        Pet pet = applicationContext.getBean(Pet.class);
        pet.execute();
    }
}
