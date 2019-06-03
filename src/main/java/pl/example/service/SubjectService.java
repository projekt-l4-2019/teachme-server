package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.SubjectEntity;
import pl.example.repository.SubjectRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;


    public List<SubjectEntity> getAllSubject() {
        List<SubjectEntity> subject = new ArrayList<>();
        subjectRepository.findAll().forEach(subject::add);
        return subject;
    }

    public SubjectEntity getSubject(Integer id) {
        return subjectRepository.findById(id).get();
    }

    public void addSubject(SubjectEntity subject) {
        subjectRepository.save(subject);
    }


    public void updateSubject(Integer id, SubjectEntity subject) {
        subjectRepository.save(subject);
    }


    public void deleteSubject(Integer id) {
        subjectRepository.deleteById(id);
    }
}
