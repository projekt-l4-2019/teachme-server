package pl.com.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.com.project.Notices.NoticeFullRepository;
import pl.com.project.Users.PeopleRepository;

import java.util.LinkedHashMap;

@Controller
public class HelloController {

    PeopleRepository peopleRepository;
    NoticeFullRepository noticeFullRepository;

    @Autowired
    public HelloController(PeopleRepository peopleRepository, NoticeFullRepository noticeFullRepository) {
        this.peopleRepository = peopleRepository;
        this.noticeFullRepository = noticeFullRepository;
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello1Model (Model model_1, Model model_2) {
        model_1.addAttribute("people",peopleRepository.findAll());
        model_2.addAttribute("notice", noticeFullRepository.findAll());
        return "hello TeachMe";
    }

    @GetMapping("addnotice")
    public String addnotice(Model model)
    {
        Object details = ((UsernamePasswordAuthenticationToken) ((OAuth2Authentication) ((SecurityContextImpl) SecurityContextHolder.getContext()).getAuthentication()).getUserAuthentication()).getDetails();
        String fullname = ((LinkedHashMap) details).values().toArray()[1].toString();
        String name = ((LinkedHashMap) details).values().toArray()[2].toString();
        String surname1 = ((LinkedHashMap) details).values().toArray()[3].toString();
        String picture = ((LinkedHashMap) details).values().toArray()[5].toString();
        String email = ((LinkedHashMap) details).values().toArray()[6].toString();

        model.addAttribute("fullname", fullname);
        model.addAttribute("name", name);
        model.addAttribute("surname1", surname1);
        model.addAttribute("picture", picture);
        model.addAttribute("email", email);
        return "addnotice";
    }

    @GetMapping("about")
    public String about()
    {
        return "about";
    }

    @GetMapping("hi")
    public String hello(Model model_1, Model model_2) {
        model_1.addAttribute("people",peopleRepository.findAll());
        model_2.addAttribute("notice", noticeFullRepository.findAll());
        return "hello";
    }



}
