package pl.example.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.example.models.NoticeEntity;
import pl.example.models.SubjectEntity;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<NoticeEntity, Integer> {

   @Query(value = "SELECT * FROM notice n WHERE  n.subject_id_subject = ?1 and n.level=?2 and n.look_or_offer = ?3 and n.meeting_place = ?4 and (n.price between ?5 and ?6)",nativeQuery = true)
    List<NoticeEntity> findBySubjectBySubjectIdSubjectAndLevelAndLookOrOfferAndMeetingPlaceAndPrice
           (SubjectEntity subjectBySubjectIdSubject, Integer level
                   , Character lookOrOffer, String meetingPlace, Double price_down, Double price_up);

}
