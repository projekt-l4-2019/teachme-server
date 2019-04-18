package pl.com.project.Notices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Notice {

    @Id
    @GeneratedValue
    private Long id;
    private String meeting_place;
    private StringBuffer note = new StringBuffer(500);
    private Date meeting_date = new Date();
    private Integer user_id_user;

    public Date getMeeting_date() {
        return meeting_date;
    }

    public void setMeeting_date(Date meeting_date) {
        this.meeting_date = meeting_date;
    }

    public Integer getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(Integer user_id_user) {
        this.user_id_user = user_id_user;
    }

    public Notice(String meeting_place, StringBuffer note, Date meeting_date, Integer user_id_user) {
        this.meeting_place = meeting_place;
        this.note = note;
        this.meeting_date = meeting_date;
        this.user_id_user = user_id_user;
    }

    public Notice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeeting_place() {
        return meeting_place;
    }

    public void setMeeting_place(String meeting_place) {
        this.meeting_place = meeting_place;
    }

    public StringBuffer getNote() {
        return note;
    }

    public void setNote(StringBuffer note) {
        this.note = note;
    }
}
