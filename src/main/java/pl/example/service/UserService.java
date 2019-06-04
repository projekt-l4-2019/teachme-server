package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.controllers.OpinionController;
import pl.example.models.*;
import pl.example.repository.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;




    public List<UserrEntity> getAllUser() {
        List<UserrEntity> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);
        for(UserrEntity us: user) {
            us.setCityByCityIdCity(null);
          //  us.getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
        }
        return user;
    }

    public UserrEntity getUser(Integer id) {
        UserrEntity user = userRepository.findById(id).get();
        user.getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
      //  OpinionEntity opi = opinionRepository.findById(id).get();
      //  opi.setUserByUserFrom(null);
       // opi.setUserByUserTo(null);
        user.setMeetingsByIdUser(null);

        return user;
    }

    public void addUser(UserrEntity user) {
        userRepository.save(user);
    }


    public void updateUser(Integer id, UserrEntity user) {
        userRepository.save(user);
    }


    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
