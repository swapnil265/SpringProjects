package guru.springframework.spring5webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/home")
    public String getHome(){
        return "Home" ;
    }
}
