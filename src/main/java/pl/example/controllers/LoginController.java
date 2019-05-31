package pl.example.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    @CrossOrigin(origins = "*")
    public String login()
    {
        return "You've just logged in!";
    }
}
