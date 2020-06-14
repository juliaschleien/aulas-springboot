package julia.schleien.exemplolombok.controllers;

import julia.schleien.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient() {

        //base de dados...banco de dados.
        Client client = new Client();
        client.setName("Julia");
        client.setLastName("Schleien");
        client.setAge(21);
        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        //base de dados...banco de dados.
        Client client = new Client();
        client.setName("Julia");
        client.setLastName("Schleien");
        client.setAge(21);

        Client client1 = new Client();
        client1.setName("Marcos");
        client1.setLastName("Silva");
        client1.setAge(34);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
