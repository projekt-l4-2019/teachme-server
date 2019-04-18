package pl.com.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.com.project.Notices.NoticeRepository;
import pl.com.project.Users.PeopleRepository;

@Controller
public class HelloController {

    PeopleRepository peopleRepository;
    NoticeRepository noticeRepository;

    @Autowired
    public HelloController(PeopleRepository peopleRepository, NoticeRepository noticeRepository) {
        this.peopleRepository = peopleRepository;
        this.noticeRepository = noticeRepository;
    }

    @RequestMapping("/")
    @ResponseBody
    public String hello1Model (Model model_1, Model model_2) {
        model_1.addAttribute("people",peopleRepository.findAll());
        model_2.addAttribute("note",noticeRepository.findAll());
        return "hello TeachMe";
    }

   /* @RequestMapping("/loggeduser")
    @ResponseBody
    public String loggedUserAction() {
        return "Hello User 1234";
    }*/

    @GetMapping("hi")
    public String hello(Model model_1, Model model_2) {
        model_1.addAttribute("people",peopleRepository.findAll());
        model_2.addAttribute("note",noticeRepository.findAll());
        return "hello";
    }



}
