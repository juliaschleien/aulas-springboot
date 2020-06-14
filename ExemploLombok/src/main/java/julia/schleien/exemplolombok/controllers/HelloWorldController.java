package julia.schleien.exemplolombok.controllers;

import julia.schleien.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo lombok";
    }

    @GetMapping("/product")
    public String getProduct() {
        return "Objeto produto";
    }
}
