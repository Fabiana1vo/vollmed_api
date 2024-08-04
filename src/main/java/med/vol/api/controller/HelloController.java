package med.vol.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Isso informa que a classe trata-se de um rest controller
@RequestMapping("/hello") //Isso define a rota do controller
public class HelloController {

    @GetMapping //Isso define o verbo http que será usado nessa rota
    public String olaMundo(){
        return "Hello World!";
    }

}
