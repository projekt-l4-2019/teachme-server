package pl.com.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.com.project.PeopleRepository;
import pl.com.project.Person;

@Controller
public class HelloController {

    PeopleRepository peopleRepository;

    @Autowired
    public HelloController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello1(Model model) {
        model.addAttribute("people",peopleRepository.findAll());
        return "hello123456656456";
    }

   /* @RequestMapping("/loggeduser")
    @ResponseBody
    public String loggedUserAction() {
        return "Hello User 1234";
    }*/

    @CrossOrigin(origins = "https://rhubarb-cobbler-84890.herokuapp.com")
    @GetMapping("hi")
    public String hello(Model model) {
        model.addAttribute("people",peopleRepository.findAll());
        model.addAttribute("id",peopleRepository.findAll());
        return "hello";
    }



}
