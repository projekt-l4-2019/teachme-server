package pl.example.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "meeting", schema = "public", catalog = "d2b6rsc8m7io0b")
public class MeetingEntity {
    private int idMeeting;
    private Date date;
    private Timestamp time;
  //  private Integer userrIdUser;
    private String meetingPlace;
    //private Integer noticeIdNotice;
    private UserrEntity userrByUserrIdUser;
    private NoticeEntity noticeByNoticeIdNotice;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Column(name = "id_meeting", nullable = false)
    public int getIdMeeting() {
        return idMeeting;
    }

    public void setIdMeeting(int idMeeting) {
        this.idMeeting = idMeeting;
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
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
    /*

    @Basic
    @Column(name = "userr_id_user", nullable = true,insertable=false, updatable=false)
    public Integer getUserrIdUser() {
        return userrIdUser;
    }

    public void setUserrIdUser(Integer userrIdUser) {
        this.userrIdUser = userrIdUser;
    }
*/
    @Basic
    @Column(name = "meeting_place", nullable = true, length = 127)
    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }
/*
    @Basic
    @Column(name = "notice_id_notice", nullable = true,insertable=false, updatable=false)
    public Integer getNoticeIdNotice() {
        return noticeIdNotice;
    }

    public void setNoticeIdNotice(Integer noticeIdNotice) {
        this.noticeIdNotice = noticeIdNotice;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingEntity that = (MeetingEntity) o;

        if (idMeeting != that.idMeeting) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
       // if (userrIdUser != null ? !userrIdUser.equals(that.userrIdUser) : that.userrIdUser != null) return false;
        if (meetingPlace != null ? !meetingPlace.equals(that.meetingPlace) : that.meetingPlace != null) return false;
      //  if (noticeIdNotice != null ? !noticeIdNotice.equals(that.noticeIdNotice) : that.noticeIdNotice != null)
         //   return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = idMeeting;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
      //  result = 31 * result + (userrIdUser != null ? userrIdUser.hashCode() : 0);
        result = 31 * result + (meetingPlace != null ? meetingPlace.hashCode() : 0);
       // result = 31 * result + (noticeIdNotice != null ? noticeIdNotice.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "userr_id_user", referencedColumnName = "id_user")
    public UserrEntity getUserrByUserrIdUser() {
        return userrByUserrIdUser;
    }

    public void setUserrByUserrIdUser(UserrEntity userrByUserrIdUser) {
        this.userrByUserrIdUser = userrByUserrIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "notice_id_notice", referencedColumnName = "id_notice")
    public NoticeEntity getNoticeByNoticeIdNotice() {
        return noticeByNoticeIdNotice;
    }

    public void setNoticeByNoticeIdNotice(NoticeEntity noticeByNoticeIdNotice) {
        this.noticeByNoticeIdNotice = noticeByNoticeIdNotice;
    }
}
