package pl.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.example.models.*;
import pl.example.repository.*;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private int currentUserId;

    public List<UserrEntity> getAllUser() {
        List<UserrEntity> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);

        for(UserrEntity us: user) {
            us.getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
            us.setPassword(null);
            us.setLogin(null);
            List<NoticeEntity> notice = new ArrayList<>();
            us.getNoticesByIdUser().forEach(notice::add);

            for(NoticeEntity no: notice) {
                no.setUserrByUserrIdUser(null);
                no.setMeetingsByIdNotice(null);
                no.getSubjectBySubjectIdSubject().setNoticesByIdSubject(null);
            }

            List<OpinionEntity> opinion_to = new ArrayList<>();
            us.getOpinionsByIdUser().forEach(opinion_to::add);
            for(OpinionEntity op_to: opinion_to) {
                op_to.setUserrByUserFrom(null);
                op_to.setUserrByUserTo(null);
            }

            List<OpinionEntity> opinion_from = new ArrayList<>();
            us.getOpinionsByIdUser_0().forEach(opinion_from::add);
            for(OpinionEntity op_from: opinion_from) {
                op_from.setUserrByUserFrom(null);
                op_from.setUserrByUserTo(null);
            }

        }

        return user;
    }

    public UserrEntity getUser(Integer id) {
        UserrEntity user = userRepository.findById(id).get();
        user.getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
        user.setMeetingsByIdUser(null);
        user.setPassword(null);
        user.setLogin(null);

        List<NoticeEntity> notice = new ArrayList<>();
      user.getNoticesByIdUser().forEach(notice::add);
        for(NoticeEntity no: notice) {
            no.setUserrByUserrIdUser(null);
            no.setMeetingsByIdNotice(null);
            no.getSubjectBySubjectIdSubject().setNoticesByIdSubject(null);
        }

        List<OpinionEntity> opinion_to = new ArrayList<>();
        user.getOpinionsByIdUser().forEach(opinion_to::add);
        for(OpinionEntity op_to: opinion_to) {
            op_to.setUserrByUserFrom(null);
            op_to.setUserrByUserTo(null);
        }

        List<OpinionEntity> opinion_from = new ArrayList<>();
        user.getOpinionsByIdUser_0().forEach(opinion_from::add);
        for(OpinionEntity op_from: opinion_from) {
            op_from.setUserrByUserFrom(null);
            op_from.setUserrByUserTo(null);
        }
        return user;
    }

    public void addUser(UserrEntity user) {
        userRepository.save(user);
    }


    public void updateUser(Integer id, UserrEntity user) {
        userRepository.save(user);
    }


    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public UserrEntity getCurrentUser() {
        UserrEntity user =  userRepository.findById(currentUserId).get();
        user.getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
        user.setMeetingsByIdUser(null);
        user.setPassword(null);
        user.setLogin(null);

        List<NoticeEntity> notice = new ArrayList<>();
        user.getNoticesByIdUser().forEach(notice::add);
        for(NoticeEntity no: notice) {
            no.setUserrByUserrIdUser(null);
            no.setMeetingsByIdNotice(null);
            no.getSubjectBySubjectIdSubject().setNoticesByIdSubject(null);
        }

        List<OpinionEntity> opinion_to = new ArrayList<>();
        user.getOpinionsByIdUser().forEach(opinion_to::add);
        for(OpinionEntity op_to: opinion_to) {
            op_to.setUserrByUserFrom(null);
            op_to.setUserrByUserTo(null);
        }

        List<OpinionEntity> opinion_from = new ArrayList<>();
        user.getOpinionsByIdUser_0().forEach(opinion_from::add);
        for(OpinionEntity op_from: opinion_from) {
            op_from.setUserrByUserFrom(null);
            op_from.setUserrByUserTo(null);
        }
    return user;
    }

    public void setCurrentUserId(int id){currentUserId = id;}
}
