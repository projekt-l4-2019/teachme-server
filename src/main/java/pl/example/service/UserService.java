package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.UserEntity;
import pl.example.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserEntity> getAllUser() {
        List<UserEntity> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);
        return user;
    }

    public UserEntity getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void addUser(UserEntity user) {
        userRepository.save(user);
    }


    public void updateUser(Integer id, UserEntity user) {
        userRepository.save(user);
    }


    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
