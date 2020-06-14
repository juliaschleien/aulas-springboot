package julia.schleien.exemplohelloworldrestrepositories.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julia Schleien
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Olá World com Rest Repositories";
    }
}
