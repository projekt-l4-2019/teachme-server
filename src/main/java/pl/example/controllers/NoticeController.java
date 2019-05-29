package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.NoticeEntity;
import pl.example.service.NoticeService;

import java.util.List;

@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/notices")
    public List<NoticeEntity> getAllNotice() {
        return noticeService.getAllNotice();
    }

    @RequestMapping("/notices/{id}")
    public NoticeEntity getNotice(@PathVariable Integer id) {
        return noticeService.getNotice(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/notices")
    public void addNotice(@RequestBody NoticeEntity notice) {
        noticeService.addNotice(notice);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/notices/{id}")
    public void updateNotice(@RequestBody NoticeEntity notice, @PathVariable Integer id) {
        noticeService.updateNotice(id, notice);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/notices/{id}")
    public void deleteNotice(@PathVariable Integer id) {
         noticeService.deleteNotice(id);
    }

}
