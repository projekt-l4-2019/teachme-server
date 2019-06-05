package pl.example.service;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import pl.example.models.NoticeEntity;
        import pl.example.models.SubjectEntity;
        import pl.example.repository.NoticeRepository;

        import java.sql.Timestamp;
        import java.time.LocalDateTime;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;


@Service
public class NoticeService {


    @Autowired
    private NoticeRepository noticeRepository;

    public List<NoticeEntity> getAllNotice() {
        List<NoticeEntity> notices = new ArrayList<>();
        noticeRepository.findAll().forEach(notices::add);
        for(NoticeEntity no: notices)
        {
            no.getSubjectBySubjectIdSubject().setNoticesByIdSubject(null);
            no.getUserrByUserrIdUser().setOpinionsByIdUser_0(null);
            no.getUserrByUserrIdUser().setOpinionsByIdUser(null);
            no.getUserrByUserrIdUser().setNoticesByIdUser(null);
            no.getUserrByUserrIdUser().setMeetingsByIdUser(null);
            no.getUserrByUserrIdUser().getCityByCityIdCity().setUserrsByIdCity(null);
            no.getUserrByUserrIdUser().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
            no.getUserrByUserrIdUser().setLogin(null);
            no.getUserrByUserrIdUser().setPassword(null);
        }
        return notices;
    }

    public NoticeEntity getNotice(Integer id) {

        NoticeEntity no = noticeRepository.findById(id).get();
        no.getSubjectBySubjectIdSubject().setNoticesByIdSubject(null);
        no.getUserrByUserrIdUser().setOpinionsByIdUser_0(null);
        no.getUserrByUserrIdUser().setOpinionsByIdUser(null);
        no.getUserrByUserrIdUser().setNoticesByIdUser(null);
        no.getUserrByUserrIdUser().setMeetingsByIdUser(null);
        no.getUserrByUserrIdUser().getCityByCityIdCity().setUserrsByIdCity(null);
        no.getUserrByUserrIdUser().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
        no.getUserrByUserrIdUser().setLogin(null);
        no.getUserrByUserrIdUser().setPassword(null);
        return no;
    }

    public void addNotice(NoticeEntity notice) {
        notice.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        noticeRepository.save(notice);
    }


    public void updateNotice(Integer id, NoticeEntity notice) {
        noticeRepository.save(notice);
    }


    public void deleteNotice(Integer id) {
        noticeRepository.deleteById(id);
    }

    public List<NoticeEntity> searchNotice(SubjectEntity subjectBySubjectIdSubject, Integer level
            , Character lookOrOffer, String meetingPlace, Double price_down, Double price_up, Boolean sort)
    {
        List<NoticeEntity> notices = new ArrayList<>();
        noticeRepository.findBySubjectBySubjectIdSubjectAndLevelAndLookOrOfferAndMeetingPlaceAndPrice(
                 subjectBySubjectIdSubject, level , lookOrOffer, meetingPlace, price_down, price_up).forEach(notices::add);
        for(NoticeEntity no: notices)
        {
            no.getSubjectBySubjectIdSubject().setNoticesByIdSubject(null);
            no.getUserrByUserrIdUser().setOpinionsByIdUser_0(null);
            no.getUserrByUserrIdUser().setOpinionsByIdUser(null);
            no.getUserrByUserrIdUser().setNoticesByIdUser(null);
            no.getUserrByUserrIdUser().setMeetingsByIdUser(null);
            no.getUserrByUserrIdUser().getCityByCityIdCity().setUserrsByIdCity(null);
            no.getUserrByUserrIdUser().getCityByCityIdCity().setVoivodeshipByVoivodeshipIdVoivodeship(null);
            no.getUserrByUserrIdUser().setLogin(null);
            no.getUserrByUserrIdUser().setPassword(null);
        }
        if(sort==true) {
            //rosnąco
            Collections.sort(notices, new Comparator() {
                @Override
                public int compare(Object userOne, Object userTwo) {
                    //use instanceof to verify the references are indeed of the type in question
                    return ((NoticeEntity) userOne).getPrice()
                            .compareTo(((NoticeEntity) userTwo).getPrice());
                }
            });
        }else {
            //malejąco
            Collections.sort(notices, new Comparator() {
                @Override
                public int compare(Object userOne, Object userTwo) {
                    //use instanceof to verify the references are indeed of the type in question
                    return ((NoticeEntity) userTwo).getPrice()
                            .compareTo(((NoticeEntity) userOne).getPrice());
                }
            });
        }
        return notices;
    }
}
