package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.CityEntity;
import pl.example.repository.CityRepository;
import pl.example.repository.VoivodeshipRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<CityEntity> getAllCity() {
        List<CityEntity> city = new ArrayList<>();
        cityRepository.findAll().forEach(city::add);
        for(CityEntity ci: city)
        {
            ci.getVoivodeshipByVoivodeshipIdVoivodeship().setCitiesByIdVoivodeship(null);
        }
        return city;
    }

    public CityEntity getCity(Integer id) {
        CityEntity city = cityRepository.findById(id).get();
        city.getVoivodeshipByVoivodeshipIdVoivodeship().setCitiesByIdVoivodeship(null);
        return city;
    }

    public void addCity(CityEntity city) {
        cityRepository.save(city);
    }


    public void updateCity(Integer id, CityEntity city) {
        cityRepository.save(city);
    }


    public void deleteCity(Integer id) {
        cityRepository.deleteById(id);
    }
}

