package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.UserEntity;
import pl.example.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<UserEntity> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("/users/{id}")
    public UserEntity getNotice(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/users")
    public void addNotice(@RequestBody UserEntity user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/users/{id}")
    public void updateNotice(@RequestBody UserEntity user, @PathVariable Integer id) {
        userService.updateUser(id, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/users/{id}")
    public void deleteNotice(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
