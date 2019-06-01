package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.MeetingEntity;
import pl.example.repository.MeetingRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeetingService {

        @Autowired
        private MeetingRepository meetingRepository;


        public List<MeetingEntity> getAllMeeting() {
            List<MeetingEntity> meeting = new ArrayList<>();
            meetingRepository.findAll().forEach(meeting::add);
            return meeting;
        }

        public MeetingEntity getMeeting(Integer id) {
            return meetingRepository.findById(id).get();
        }

        public void addMeeting(MeetingEntity meeting) {
            meetingRepository.save(meeting);
        }


        public void updateMeeting(Integer id, MeetingEntity notice) {
            meetingRepository.save(notice);
        }


        public void deleteMeeting(Integer id) {
            meetingRepository.deleteById(id);
        }
    }
