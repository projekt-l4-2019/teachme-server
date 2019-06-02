package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.controllers.OpinionController;
import pl.example.models.CityEntity;
import pl.example.models.NoticeEntity;
import pl.example.models.OpinionEntity;
import pl.example.models.UserEntity;
import pl.example.repository.CityRepository;
import pl.example.repository.OpinionRepository;
import pl.example.repository.UserRepository;
import pl.example.repository.VoivodeshipRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private OpinionRepository opinionRepository;


    public List<UserEntity> getAllUser() {
        List<UserEntity> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);
        for(int i=1;i<=user.size();i++) {
            UserEntity ne = userRepository.findById(i).get();
            ne.setNoticesByIdUser(null);
            int id_city_temp = ne.getCityIdCity();
            CityEntity ci = cityRepository.findById(id_city_temp).get();
            ci.setVoivodeshipByVoivodeshipIdVoivodeship(null);
        }
        return user;
    }

    public UserEntity getUser(Integer id) {
        OpinionEntity opi = opinionRepository.findById(id).get();
        opi.setUserByUserFrom(null);
        opi.setUserByUserTo(null);
       UserEntity user = userRepository.findById(id).get();
        int id_city_temp = user.getCityIdCity();
        user.setMeetingsByIdUser(null);
        CityEntity city = cityRepository.findById(id_city_temp).get();
        city.setVoivodeshipByVoivodeshipIdVoivodeship(null);
        return user;
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
