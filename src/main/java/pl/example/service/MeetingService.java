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
            for(MeetingEntity me: meeting)
            {
                me.getUserrByUserrIdUser().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
                me.getUserrByUserrIdUser().setLogin(null);
                me.getUserrByUserrIdUser().setMeetingsByIdUser(null);
                me.getUserrByUserrIdUser().setNoticesByIdUser(null);
                me.getUserrByUserrIdUser().setOpinionsByIdUser(null);
                me.getUserrByUserrIdUser().setOpinionsByIdUser_0(null);
                me.getUserrByUserrIdUser().setPassword(null);
                me.getNoticeByNoticeIdNotice().setMeetingsByIdNotice(null);
                me.getNoticeByNoticeIdNotice().setUserrByUserrIdUser(null);

            }
            return meeting;
        }

        public MeetingEntity getMeeting(Integer id) {
            MeetingEntity me = meetingRepository.findById(id).get();
            me.getUserrByUserrIdUser().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
            me.getUserrByUserrIdUser().setLogin(null);
            me.getUserrByUserrIdUser().setMeetingsByIdUser(null);
            me.getUserrByUserrIdUser().setNoticesByIdUser(null);
            me.getUserrByUserrIdUser().setOpinionsByIdUser(null);
            me.getUserrByUserrIdUser().setOpinionsByIdUser_0(null);
            me.getUserrByUserrIdUser().setPassword(null);
            me.getNoticeByNoticeIdNotice().setMeetingsByIdNotice(null);
            me.getNoticeByNoticeIdNotice().setUserrByUserrIdUser(null);
            return me;
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
