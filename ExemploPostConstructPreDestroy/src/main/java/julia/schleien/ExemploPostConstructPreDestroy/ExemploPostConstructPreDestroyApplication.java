package julia.schleien.ExemploPostConstructPreDestroy;

import julia.schleien.ExemploPostConstructPreDestroy.dao.ClientDAO;
import julia.schleien.ExemploPostConstructPreDestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploPostConstructPreDestroyApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructPreDestroyApplication.class, args);

        ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

        clientDAO.setClient(new Client("Julia", "Schleien"));

        System.out.println("ClientDAO: " + clientDAO);
        System.out.println("Client: " + clientDAO.getClient().toString());
    }
}
