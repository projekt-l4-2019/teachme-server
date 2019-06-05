package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.NoticeEntity;
import pl.example.models.SubjectEntity;
import pl.example.service.NoticeService;

import java.util.List;

@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/notices")
    @CrossOrigin(origins = "*")
    public List<NoticeEntity> getAllNotice() {
        return noticeService.getAllNotice();
    }

    @RequestMapping("/notices/{id}")
    @CrossOrigin(origins = "*")
    public NoticeEntity getNotice(@PathVariable Integer id) {
        return noticeService.getNotice(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/notices")
    @CrossOrigin(origins = "*")
    public void addNotice(@RequestBody NoticeEntity notice) {

        noticeService.addNotice(notice);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/notices/{id}")
    @CrossOrigin(origins = "*")
    public void updateNotice(@RequestBody NoticeEntity notice, @PathVariable Integer id) {
        noticeService.updateNotice(id, notice);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/notices/{id}")
    @CrossOrigin(origins = "*")
    public void deleteNotice(@PathVariable Integer id) {
         noticeService.deleteNotice(id);
    }

    @RequestMapping("/notices/find/{subjectBySubjectIdSubject}/{level}/{lookOrOffer}/{meetingPlace}/{price_down}/{price_up}/{sort}")
    @CrossOrigin(origins = "*")
    public List<NoticeEntity> searchNotice(@PathVariable SubjectEntity subjectBySubjectIdSubject, @PathVariable Integer level
            ,@PathVariable Character lookOrOffer,@PathVariable String meetingPlace,@PathVariable Double price_down,@PathVariable Double price_up, @PathVariable Boolean sort) {

        return noticeService.searchNotice(subjectBySubjectIdSubject,level, lookOrOffer, meetingPlace, price_down, price_up, sort);
    }
}
