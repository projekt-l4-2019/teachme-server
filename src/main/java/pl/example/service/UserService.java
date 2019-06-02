package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.CityEntity;
import pl.example.models.UserEntity;
import pl.example.repository.CityRepository;
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
    VoivodeshipRepository voivodeshipRepository;


    public List<UserEntity> getAllUser() {
        UserEntity us;
        List<CityEntity> city = new ArrayList<>();

        cityRepository.findAll().forEach(city::add);
        for(int i=0;i<city.size();i++) {
            CityEntity ci = cityRepository.findById(i).get();
            ci.setVoivodeshipByVoivodeshipIdVoivodeship(null);
        }

       // length(cityRepository.findAll().forEach(city.);
        List<UserEntity> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);
       // cityRepository.findAll().forEach(city::add);
       /* List<CityEntity> city = new ArrayList<>();
        cityRepository.findAll().forEach(city::add);*/
        return user;
    }

    public UserEntity getUser(Integer id) {
        //return userRepository.findById(id).get();
       UserEntity ne = userRepository.findById(id).get();
        int id_city_temp = ne.getCityIdCity();
        CityEntity city = cityRepository.findById(id_city_temp).get();
        city.setVoivodeshipByVoivodeshipIdVoivodeship(null);
        return ne;
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
