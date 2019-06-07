package pl.example.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements ErrorController {

    private static final String PATH ="/error";

    @RequestMapping("/hello")
    @CrossOrigin(origins = "*")
    public String sayHI()
    {
        return "Hi";
    }


    @RequestMapping(value = PATH)
    public String error(){
        return "Zalogowano";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
