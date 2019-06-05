package pl.example.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "notice", schema = "public", catalog = "d2b6rsc8m7io0b")
public class NoticeEntity {
    private int idNotice;
    private Character lookOrOffer;
    private String note;
    private String meetingPlace;
    private Date meetingDate;
    private Double price;
  //  private int subjectIdSubject;
    private Character active;
    @Column(name = "timestamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp timestamp;
 //   private Integer userrIdUser;
    private Timestamp timeFrom;
    private Timestamp timeTo;
    private Integer level;
    private Collection<MeetingEntity> meetingsByIdNotice;
    private SubjectEntity subjectBySubjectIdSubject;
    private UserrEntity userrByUserrIdUser;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Column(name = "id_notice", nullable = false)
    public int getIdNotice() {
        return idNotice;
    }

    public void setIdNotice(int idNotice) {
        this.idNotice = idNotice;
    }

    @Basic
    @Column(name = "look_or_offer", nullable = true, length = -1)
    public Character getLookOrOffer() {
        return lookOrOffer;
    }

    public void setLookOrOffer(Character lookOrOffer) {
        this.lookOrOffer = lookOrOffer;
    }

    @Basic
    @Column(name = "note", nullable = false, length = 512)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "meeting_place", nullable = false, length = 127)
    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    @Basic
    @Column(name = "meeting_date", nullable = false)
    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

 /*   @Basic
    @Column(name = "subject_id_subject", nullable = false, insertable=false, updatable=false)
    public int getSubjectIdSubject() {
        return subjectIdSubject;
    }

    public void setSubjectIdSubject(int subjectIdSubject) {
        this.subjectIdSubject = subjectIdSubject;
    }*/

    @Basic
    @Column(name = "active", nullable = false, length = -1)
    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    @Basic
    @Column(name = "timestamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

  /*  @Basic
    @Column(name = "userr_id_user", nullable = true,insertable=false, updatable=false)
    public Integer getUserrIdUser() {
        return userrIdUser;
    }

    public void setUserrIdUser(Integer userrIdUser) {
        this.userrIdUser = userrIdUser;
    }*/

    @Basic
    @Column(name = "time_from", nullable = true)
    public Timestamp getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Timestamp timeFrom) {
        this.timeFrom = timeFrom;
    }

    @Basic
    @Column(name = "time_to", nullable = true)
    public Timestamp getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Timestamp timeTo) {
        this.timeTo = timeTo;
    }

    @Basic
    @Column(name = "level", nullable = true)
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeEntity that = (NoticeEntity) o;

        if (idNotice != that.idNotice) return false;
    //    if (subjectIdSubject != that.subjectIdSubject) return false;
        //if (meetingIdMeeting != that.meetingIdMeeting) return false;
        if (lookOrOffer != null ? !lookOrOffer.equals(that.lookOrOffer) : that.lookOrOffer != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (meetingPlace != null ? !meetingPlace.equals(that.meetingPlace) : that.meetingPlace != null) return false;
        if (meetingDate != null ? !meetingDate.equals(that.meetingDate) : that.meetingDate != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
     //   if (userrIdUser != null ? !userrIdUser.equals(that.userrIdUser) : that.userrIdUser != null) return false;
        if (timeFrom != null ? !timeFrom.equals(that.timeFrom) : that.timeFrom != null) return false;
        if (timeTo != null ? !timeTo.equals(that.timeTo) : that.timeTo != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNotice;
        result = 31 * result + (lookOrOffer != null ? lookOrOffer.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (meetingPlace != null ? meetingPlace.hashCode() : 0);
        result = 31 * result + (meetingDate != null ? meetingDate.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
     //   result = 31 * result + subjectIdSubject;
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
      //  result = 31 * result + (userrIdUser != null ? userrIdUser.hashCode() : 0);
        result = 31 * result + (timeFrom != null ? timeFrom.hashCode() : 0);
        result = 31 * result + (timeTo != null ? timeTo.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
      //  result = 31 * result + meetingIdMeeting;
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "noticeByNoticeIdNotice")
    public Collection<MeetingEntity> getMeetingsByIdNotice() {
        return meetingsByIdNotice;
    }

    public void setMeetingsByIdNotice(Collection<MeetingEntity> meetingsByIdNotice) {
        this.meetingsByIdNotice = meetingsByIdNotice;
    }

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "subject_id_subject", referencedColumnName = "id_subject", nullable = false)
    public SubjectEntity getSubjectBySubjectIdSubject() {
        return subjectBySubjectIdSubject;
    }

    public void setSubjectBySubjectIdSubject(SubjectEntity subjectBySubjectIdSubject) {
        this.subjectBySubjectIdSubject = subjectBySubjectIdSubject;
    }

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "userr_id_user", referencedColumnName = "id_user")
    public UserrEntity getUserrByUserrIdUser() {
        return userrByUserrIdUser;
    }

    public void setUserrByUserrIdUser(UserrEntity userrByUserrIdUser) {
        this.userrByUserrIdUser = userrByUserrIdUser;
    }
}
