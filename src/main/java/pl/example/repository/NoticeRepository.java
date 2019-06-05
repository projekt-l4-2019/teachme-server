package pl.example.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.NoticeEntity;

@Repository
public interface NoticeRepository extends CrudRepository<NoticeEntity, Integer> {
   // NoticeEntity findBySubjectBySubjectIdSubjectAndLevelAndLookOrOffer(Integer subject_id_subject,);

 /*  @Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName) Like (p.lastName)")
    public List<Person> find(@Param("lastName") String fraza);*/
}
//subject
//level
//wojewodztwo
//city
//look_or_offer
//cena