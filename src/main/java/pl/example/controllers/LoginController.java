package pl.example.controllers;

import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class LoginController {

//    @RequestMapping("/login")
//    @CrossOrigin(origins = "*")
//    public String login()
//    {
//        return "You've just logged in!";
//    }
//
//    @RequestMapping("/logout")
//    @CrossOrigin(origins = "*")
//    public void exit(HttpServletRequest request, HttpServletResponse response) {
//        // token can be revoked here if needed
//        new SecurityContextLogoutHandler().logout(request, null, null);
//        try {
//            //sending back to client app
//            response.sendRedirect(request.getHeader("referer"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

