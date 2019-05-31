package pl.example.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Collection;

@Entity
@Table(name = "meeting", schema = "public", catalog = "d2b6rsc8m7io0b")
public class MeetingEntity {
    private int idMeeting;
    private String meetingPlace;
    private Date date;
    private Time time;
    private int subjectIdSubject;
    private Integer userIdUser;
    private int meetingCacheIdUserCache;
    private SubjectEntity subjectBySubjectIdSubject;
    private UserEntity userByUserIdUser;
    private Collection<NoticeEntity> noticesByIdMeeting;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_meeting", nullable = false)
    public int getIdMeeting() {
        return idMeeting;
    }

    public void setIdMeeting(int idMeeting) {
        this.idMeeting = idMeeting;
    }

    @Basic
    @Column(name = "meeting_place", nullable = false)
    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Basic
    @Column(name = "subject_id_subject", nullable = false,insertable = false, updatable = false)
    public int getSubjectIdSubject() {
        return subjectIdSubject;
    }

    public void setSubjectIdSubject(int subjectIdSubject) {
        this.subjectIdSubject = subjectIdSubject;
    }

    @Basic
    @Column(name = "user_id_user", nullable = true,insertable = false, updatable = false)
    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingEntity that = (MeetingEntity) o;

        if (idMeeting != that.idMeeting) return false;
        if (meetingPlace != that.meetingPlace) return false;
        if (subjectIdSubject != that.subjectIdSubject) return false;
        if (meetingCacheIdUserCache != that.meetingCacheIdUserCache) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (userIdUser != null ? !userIdUser.equals(that.userIdUser) : that.userIdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMeeting;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + subjectIdSubject;
        result = 31 * result + (userIdUser != null ? userIdUser.hashCode() : 0);
        result = 31 * result + meetingCacheIdUserCache;
        return result;
    }


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


    @JsonIgnore
    @OneToMany(mappedBy = "meetingByMeetingIdMeeting")
    public Collection<NoticeEntity> getNoticesByIdMeeting() {
        return noticesByIdMeeting;
    }

    public void setNoticesByIdMeeting(Collection<NoticeEntity> noticesByIdMeeting) {
        this.noticesByIdMeeting = noticesByIdMeeting;
    }
}
