package pl.example.service;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import pl.example.models.NoticeEntity;
        import pl.example.repository.NoticeRepository;
        import pl.example.repository.UserRepository;

        import java.util.ArrayList;
        import java.util.List;


@Service
public class NoticeService {


    @Autowired
    private NoticeRepository noticeRepository;
    @Autowired
    private UserRepository userRepository;

    public List<NoticeEntity> getAllNotice() {
        List<NoticeEntity> notices = new ArrayList<>();
        noticeRepository.findAll().forEach(notices::add);
       /* List<UserEntity> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);*/
        for(int i=1;i<=100;i++) {
           // NoticeEntity ne = noticeRepository.findById(i).get();
          /*  ne.getUserByUserIdUser().setOpinionsByIdUser(null);
            ne.getUserByUserIdUser().setOpinionsByIdUser_0(null);
            ne.getUserByUserIdUser().setNoticesByIdUser(null);
            ne.getUserByUserIdUser().setCityByCityIdCity(null);
            ne.getUserByUserIdUser().setMeetingsByIdUser(null);
            ne.getUserByUserIdUser().setPassword(null);
            ne.getUserByUserIdUser().setLogin(null);*/
         /*   UserEntity ne = userRepository.findById(i).get();
            ne.setCityByCityIdCity(null);
            ne.setMeetingsByIdUser(null);
            ne.setOpinionsByIdUser(null);
            ne.setOpinionsByIdUser_0(null);
            ne.setNoticesByIdUser(null);
            ne.setLogin(null);
            ne.setPassword(null);*/
        }
        return notices;
    }

    public NoticeEntity getNotice(Integer id) {

        NoticeEntity ne = noticeRepository.findById(id).get();
      /*  ne.getUserByUserIdUser().setOpinionsByIdUser(null);
        ne.getUserByUserIdUser().setOpinionsByIdUser_0(null);
        ne.getUserByUserIdUser().setNoticesByIdUser(null);
        ne.getUserByUserIdUser().setCityByCityIdCity(null);
        ne.getUserByUserIdUser().setMeetingsByIdUser(null);
        ne.getUserByUserIdUser().setPassword(null);
        ne.getUserByUserIdUser().setLogin(null);*/

        return ne;
    }

    public void addNotice(NoticeEntity notice) {
        noticeRepository.save(notice);
    }


    public void updateNotice(Integer id, NoticeEntity notice) {
        noticeRepository.save(notice);
    }


    public void deleteNotice(Integer id) {
        noticeRepository.deleteById(id);
    }
}
