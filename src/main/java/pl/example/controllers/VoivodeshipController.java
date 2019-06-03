package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.example.models.VoivodeshipEntity;
import pl.example.service.VoivodeshipService;

import java.util.List;

@RestController
public class VoivodeshipController {
    @Autowired
    private VoivodeshipService voivodeshipService;

    @RequestMapping("/voivodeships")
    @CrossOrigin(origins = "*")
    public List<VoivodeshipEntity> getAllVoivodeship() {
        return voivodeshipService.getAllVoivodeship();
    }

    @RequestMapping("/voivodeships/{id}")
    @CrossOrigin(origins = "*")
    public VoivodeshipEntity getVoivodeship(@PathVariable Integer id) {
        return voivodeshipService.getVoivodeship(id);
    }

  /*  @RequestMapping(method = RequestMethod.POST, value="/users")
    @CrossOrigin(origins = "*")
    public void addNotice(@RequestBody UserEntity user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/users/{id}")
    @CrossOrigin(origins = "*")
    public void updateNotice(@RequestBody UserEntity user, @PathVariable Integer id) {
        userService.updateUser(id, user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/users/{id}")
    @CrossOrigin(origins = "*")
    public void deleteNotice(@PathVariable Integer id) {
        userService.deleteUser(id);
    }*/
}
