package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.CityEntity;
import pl.example.service.CityService;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/cities")
    @CrossOrigin(origins = "*")
    public List<CityEntity> getAllCity() {
        return cityService.getAllCity();
    }

    @RequestMapping("/cities/{id}")
    @CrossOrigin(origins = "*")
    public CityEntity getCity(@PathVariable Integer id) {
        return cityService.getCity(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/cities")
    @CrossOrigin(origins = "*")
    public void addCity(@RequestBody CityEntity city) {

        cityService.addCity(city);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/cities/{id}")
    @CrossOrigin(origins = "*")
    public void updateCity(@RequestBody CityEntity city, @PathVariable Integer id) {
        cityService.updateCity(id, city);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/cities/{id}")
    @CrossOrigin(origins = "*")
    public void deleteCity(@PathVariable Integer id) {
        cityService.deleteCity(id);
    }

}
