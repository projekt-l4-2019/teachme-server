package pl.example.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "notice", schema = "public", catalog = "d2b6rsc8m7io0b")
public class NoticeEntity {
    private Integer idNotice;
    private Character lookOrOffer;
    private String note;
    private String meetingPlace;
    private Date meetingDate;
    private Double price;
    //private int level;
    //private int subjectIdSubject;
    private Character active;
    private Timestamp timestamp;
    private Integer userIdUser;
    private Timestamp timeFrom;
    private Timestamp timeTo;
    //private int meetingIdMeeting;
    private SubjectEntity subjectBySubjectIdSubject;
    private UserEntity userByUserIdUser;
    private MeetingEntity meetingByMeetingIdMeeting;

    public NoticeEntity() {
    }

    public NoticeEntity(Integer idNotice, Character lookOrOffer, String note, String meetingPlace, Date meetingDate, Double price, int level, int subjectIdSubject, Character active, Timestamp timestamp, Integer userIdUser, Timestamp timeFrom, Timestamp timeTo, int meetingIdMeeting, SubjectEntity subjectBySubjectIdSubject, UserEntity userByUserIdUser, MeetingEntity meetingByMeetingIdMeeting) {
        this.idNotice = idNotice;
        this.lookOrOffer = lookOrOffer;
        this.note = note;
        this.meetingPlace = meetingPlace;
        this.meetingDate = meetingDate;
        this.price = price;
        //this.level = level;
        //this.subjectIdSubject = subjectIdSubject;
        this.active = active;
        this.timestamp = timestamp;
        this.userIdUser = userIdUser;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        //this.meetingIdMeeting = meetingIdMeeting;
        this.subjectBySubjectIdSubject = subjectBySubjectIdSubject;
        this.userByUserIdUser = userByUserIdUser;
        this.meetingByMeetingIdMeeting = meetingByMeetingIdMeeting;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notice", nullable = false)
    public Integer getIdNotice() {
        return idNotice;
    }

    public void setIdNotice(Integer idNotice) {
        this.idNotice = idNotice;
    }

    @Basic
    @Column(name = "look_or_offer", nullable = false, length = -1)
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



   /*@Basic
   @GeneratedValue
    @Column(name = "subject_id_subject", nullable = false,insertable = false, updatable = false)
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
    @Column(name = "timestamp", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /*@Basic
    @Column(name = "level", nullable = false, length = 127)
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }*/

    @Basic
    @Column(name = "user_id_user", nullable = true,insertable = false, updatable = false)
    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Basic
    @Column(name = "time_from", nullable = true, precision = 0)
    public Timestamp getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Timestamp timeFrom) {
        this.timeFrom = timeFrom;
    }

    @Basic
    @Column(name = "time_to", nullable = true, precision = 0)
    public Timestamp getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Timestamp timeTo) {
        this.timeTo = timeTo;
    }

    /*@Basic
    @Column(name = "meeting_id_meeting", nullable = false, insertable = false, updatable = false)
    public int getMeetingIdMeeting() {
        return meetingIdMeeting;
    }

    public void setMeetingIdMeeting(int meetingIdMeeting) {
        this.meetingIdMeeting = meetingIdMeeting;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeEntity that = (NoticeEntity) o;

        if (idNotice != that.idNotice) return false;
        //if (subjectIdSubject != that.subjectIdSubject) return false;
        //if (meetingIdMeeting != that.meetingIdMeeting) return false;
        if (lookOrOffer != null ? !lookOrOffer.equals(that.lookOrOffer) : that.lookOrOffer != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (meetingPlace != null ? !meetingPlace.equals(that.meetingPlace) : that.meetingPlace != null) return false;
        if (meetingDate != null ? !meetingDate.equals(that.meetingDate) : that.meetingDate != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (userIdUser != null ? !userIdUser.equals(that.userIdUser) : that.userIdUser != null) return false;
        if (timeFrom != null ? !timeFrom.equals(that.timeFrom) : that.timeFrom != null) return false;
        if (timeTo != null ? !timeTo.equals(that.timeTo) : that.timeTo != null) return false;

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
        //result = 31 * result + subjectIdSubject;
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (userIdUser != null ? userIdUser.hashCode() : 0);
        result = 31 * result + (timeFrom != null ? timeFrom.hashCode() : 0);
        result = 31 * result + (timeTo != null ? timeTo.hashCode() : 0);
        //result = 31 * result + meetingIdMeeting;
        return result;
    }

   // @JsonBackReference(value = "subjectBySubjectIdSubject")
    @ManyToOne
    @JoinColumn(name = "subject_id_subject", referencedColumnName = "id_subject", nullable = false)
    public SubjectEntity getSubjectBySubjectIdSubject() {
        return subjectBySubjectIdSubject;
    }

    public void setSubjectBySubjectIdSubject(SubjectEntity subjectBySubjectIdSubject) {
        this.subjectBySubjectIdSubject = subjectBySubjectIdSubject;
    }

    @ManyToOne
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user")
    public UserEntity getUserByUserIdUser() {
        return userByUserIdUser;
    }

    public void setUserByUserIdUser(UserEntity userByUserIdUser) {
        this.userByUserIdUser = userByUserIdUser;
    }

    //@JsonBackReference(value = "meetingByMeetingIdMeeting")
    @ManyToOne
    @JoinColumn(name = "meeting_id_meeting", referencedColumnName = "id_meeting", nullable = false)
    public MeetingEntity getMeetingByMeetingIdMeeting() {
        return meetingByMeetingIdMeeting;
    }

    public void setMeetingByMeetingIdMeeting(MeetingEntity meetingByMeetingIdMeeting) {
        this.meetingByMeetingIdMeeting = meetingByMeetingIdMeeting;
    }
}
