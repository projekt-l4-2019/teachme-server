package pl.com.project.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String welcome() {
        return "home";
    }

    @GetMapping("/addnotice")
    public String addnotice() {
        return "addnotice";
    }
}
