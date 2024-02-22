package pe.edu.todotic.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, value = "mundo") String nombre){
        return "Hola "+nombre+"!";
    }
}
