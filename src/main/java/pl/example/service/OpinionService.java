package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.OpinionEntity;
import pl.example.repository.OpinionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpinionService {



    @Autowired
    private OpinionRepository opinionRepository;


    public List<OpinionEntity> getAllOpinion() {
        List<OpinionEntity> notices = new ArrayList<>();
        opinionRepository.findAll().forEach(notices::add);
        return notices;
    }

    public OpinionEntity getOpinion(Integer id) {
        return opinionRepository.findById(id).get();
    }

    public void addOpinion(OpinionEntity notice) {
        opinionRepository.save(notice);
    }


    public void updateOpinion(Integer id, OpinionEntity notice) {
        opinionRepository.save(notice);
    }


    public void deleteOpinion(Integer id) {
        opinionRepository.deleteById(id);
    }
}
