package pl.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.example.models.MeetingEntity;
import pl.example.service.MeetingService;

import java.util.List;

@RestController
public class MeetingController {

   @Autowired
    private MeetingService meetingService;

    @RequestMapping("/meetings")
    @CrossOrigin(origins = "*")
    public List<MeetingEntity> getAllMeeting() {
        return meetingService.getAllMeeting();
    }

    @RequestMapping("/meetings/{id}")
    @CrossOrigin(origins = "*")
    public MeetingEntity getMeeting(@PathVariable Integer id) {
        return meetingService.getMeeting(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/meetings")
    @CrossOrigin(origins = "*")
    public void addMeeting(@RequestBody MeetingEntity meeting) {
        meetingService.addMeeting(meeting);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/meetings/{id}")
    @CrossOrigin(origins = "*")
    public void updateMeeting(@RequestBody MeetingEntity meeting, @PathVariable Integer id) {
        meetingService.updateMeeting(id, meeting);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/meetings/{id}")
    @CrossOrigin(origins = "*")
    public void deleteMeeting(@PathVariable Integer id) {
        meetingService.deleteMeeting(id);
    }
}
