package pl.example.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "meeting", schema = "public", catalog = "d2b6rsc8m7io0b")
public class MeetingEntity {
    private int idMeeting;
    private int meetingPlace;
    private Date date;
    private Date time;

    @Id
    @Column(name = "id_meeting")
    public int getIdMeeting() {
        return idMeeting;
    }

    public void setIdMeeting(int idMeeting) {
        this.idMeeting = idMeeting;
    }

    @Basic
    @Column(name = "meeting_place")
    public int getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(int meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingEntity that = (MeetingEntity) o;

        if (idMeeting != that.idMeeting) return false;
        if (meetingPlace != that.meetingPlace) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMeeting;
        result = 31 * result + meetingPlace;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
