package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.UserrEntity;
import pl.example.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/current")
    @CrossOrigin(origins = "*")
    public UserrEntity current() { return userService.getCurrentUser(); }

    @RequestMapping("/users")
    @CrossOrigin(origins = "*")
    public List<UserrEntity> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("/users/{id}")
    @CrossOrigin(origins = "*")
    public UserrEntity getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/users")
    @CrossOrigin(origins = "*")
    public void addUser(@RequestBody UserrEntity user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/users/{id}")
    @CrossOrigin(origins = "*")
    public void updateUser(@RequestBody UserrEntity user, @PathVariable Integer id) {
        userService.updateUser(id, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/users/{id}")
    @CrossOrigin(origins = "*")
    public void deleteNotice(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
