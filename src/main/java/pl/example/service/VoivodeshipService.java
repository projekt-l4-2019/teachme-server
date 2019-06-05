package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.CityEntity;
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

        for(VoivodeshipEntity vo: voivodeship) {
            List<CityEntity> voivo = new ArrayList<>();
            vo.getCitiesByIdVoivodeship().forEach(voivo::add);
            for (CityEntity no : voivo) {
                no.setVoivodeshipByVoivodeshipIdVoivodeship(null);
                no.setUserrsByIdCity(null);
            }
        }
        return voivodeship;
    }

    public VoivodeshipEntity getVoivodeship(Integer id) {
        VoivodeshipEntity voivo = voivodeshipRepositoryv.findById(id).get();

        List<CityEntity> notice = new ArrayList<>();
        voivo.getCitiesByIdVoivodeship().forEach(notice::add);
        for(CityEntity no: notice) {
            no.setVoivodeshipByVoivodeshipIdVoivodeship(null);
            no.setUserrsByIdCity(null);
        }
        return voivo;
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

