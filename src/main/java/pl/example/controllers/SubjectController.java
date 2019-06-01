package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.SubjectEntity;
import pl.example.service.SubjectService;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    @CrossOrigin(origins = "*")
    public List<SubjectEntity> getAllSubject() {
        return subjectService.getAllSubject();
    }

    @RequestMapping("/subjects/{id}")
    @CrossOrigin(origins = "*")
    public SubjectEntity getSubject(@PathVariable Integer id) {
        return subjectService.getSubject(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/subjects")
    @CrossOrigin(origins = "*")
    public void addSubject(@RequestBody SubjectEntity opinion) {
        subjectService.addSubject(opinion);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/subjects/{id}")
    @CrossOrigin(origins = "*")
    public void updateSubject(@RequestBody SubjectEntity opinion, @PathVariable Integer id) {
        subjectService.updateSubject(id, opinion);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
    @CrossOrigin(origins = "*")
    public void deleteSubject(@PathVariable Integer id) {
        subjectService.deleteSubject(id);
    }
}
