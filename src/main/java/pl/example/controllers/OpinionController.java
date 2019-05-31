package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.OpinionEntity;
import pl.example.service.OpinionService;

import java.util.List;

@RestController
public class OpinionController {
    @Autowired
    private OpinionService opinionService;

    @RequestMapping("/opinions")
    @CrossOrigin(origins = "*")
    public List<OpinionEntity> getAllOpinion() {
        return opinionService.getAllOpinion();
    }

    @RequestMapping("/opinions/{id}")
    @CrossOrigin(origins = "*")
    public OpinionEntity getOpinion(@PathVariable Integer id) {
        return opinionService.getOpinion(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/opinions")
    @CrossOrigin(origins = "*")
    public void addOpinion(@RequestBody OpinionEntity opinion) {
        opinionService.addOpinion(opinion);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/opinions/{id}")
    @CrossOrigin(origins = "*")
    public void updateOpinion(@RequestBody OpinionEntity opinion, @PathVariable Integer id) {
        opinionService.updateOpinion(id, opinion);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/opinions/{id}")
    @CrossOrigin(origins = "*")
    public void deleteOpinion(@PathVariable Integer id) {
        opinionService.deleteOpinion(id);
    }
}
