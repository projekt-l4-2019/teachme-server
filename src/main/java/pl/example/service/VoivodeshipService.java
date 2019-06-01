package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.VoivodeshipEntity;
import pl.example.repository.VoivodeshipRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoivodeshipService {

    @Autowired
    private VoivodeshipRepository voivodeshipRepositoryv;


    public List<VoivodeshipEntity> getAllVoivodeship() {
        List<VoivodeshipEntity> voivodeship = new ArrayList<>();
        voivodeshipRepositoryv.findAll().forEach(voivodeship::add);
        return voivodeship;
    }

    public VoivodeshipEntity getVoivodeship(Integer id) {
        return voivodeshipRepositoryv.findById(id).get();
    }

    public void addVoivodeship(VoivodeshipEntity voivodeship) {
        voivodeshipRepositoryv.save(voivodeship);
    }


    public void updateVoivodeship(Integer id, VoivodeshipEntity voivodeship) {
        voivodeshipRepositoryv.save(voivodeship);
    }


    public void deleteVoivodeship(Integer id) {
        voivodeshipRepositoryv.deleteById(id);
    }
}

