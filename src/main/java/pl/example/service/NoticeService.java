package pl.example.service;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import pl.example.models.CityEntity;
        import pl.example.models.NoticeEntity;
        import pl.example.models.UserEntity;
        import pl.example.repository.CityRepository;
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
    @Autowired
    private CityRepository cityRepository;

    public List<NoticeEntity> getAllNotice() {
        List<NoticeEntity> notices = new ArrayList<>();
        noticeRepository.findAll().forEach(notices::add);
        List<CityEntity> city = new ArrayList<>();
        List<UserEntity> user = new ArrayList<>();
        cityRepository.findAll().forEach(city::add);
        userRepository.findAll().forEach(user::add);
        for(int i=1;i<=user.size();i++) {
            UserEntity ne = userRepository.findById(i).get();
            ne.setCityByCityIdCity(null);
            ne.setMeetingsByIdUser(null);
            ne.setOpinionsByIdUser(null);
            ne.setOpinionsByIdUser_0(null);
            ne.setNoticesByIdUser(null);
            int id_city_temp = ne.getCityIdCity();
            CityEntity ci = cityRepository.findById(id_city_temp).get();
            ci.setVoivodeshipByVoivodeshipIdVoivodeship(null);
        }
        return notices;
    }

    public NoticeEntity getNotice(Integer id) {



        NoticeEntity ne = noticeRepository.findById(id).get();
        UserEntity user = userRepository.findById(id).get();
        int id_city_temp = user.getCityIdCity();
        user.setCityByCityIdCity(null);
        user.setMeetingsByIdUser(null);
        user.setOpinionsByIdUser(null);
        user.setOpinionsByIdUser_0(null);
        user.setNoticesByIdUser(null);
        CityEntity city = cityRepository.findById(id_city_temp).get();
        city.setVoivodeshipByVoivodeshipIdVoivodeship(null);
        user.setLogin(null);
        user.setPassword(null);
        ne.setUserByUserIdUser(null);
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
