package pl.com.project.Notices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class NoticeFull {

    @Id
    @GeneratedValue
    private Long id;
    private String meeting_place;
    private StringBuffer note = new StringBuffer(500);
    private Date meeting_date = new Date();
    private Long user_id_user;
    private Long price;
    private Long subject_id_subject;
    private Long active;
    private Date timestamp = new Date();
    private Long time_from;
    private Long time_to;
    private Long meeting_id_meeting;
    private Long look_or_offer;
    private String subject;

    public NoticeFull() {
    }

    public NoticeFull(String meeting_place, StringBuffer note, Date meeting_date, Long user_id_user, Long price, Long subject_id_subject, Long active, Date timestamp, Long time_from, Long time_to, Long meeting_id_meeting, Long look_or_offer, String subject) {
        this.meeting_place = meeting_place;
        this.note = note;
        this.meeting_date = meeting_date;
        this.user_id_user = user_id_user;
        this.price = price;
        this.subject_id_subject = subject_id_subject;
        this.active = active;
        this.timestamp = timestamp;
        this.time_from = time_from;
        this.time_to = time_to;
        this.meeting_id_meeting = meeting_id_meeting;
        this.look_or_offer = look_or_offer;
        this.subject = subject;
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

    public Date getMeeting_date() {
        return meeting_date;
    }

    public void setMeeting_date(Date meeting_date) {
        this.meeting_date = meeting_date;
    }

    public Long getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(Long user_id_user) {
        this.user_id_user = user_id_user;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSubject_id_subject() {
        return subject_id_subject;
    }

    public void setSubject_id_subject(Long subject_id_subject) {
        this.subject_id_subject = subject_id_subject;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getTime_from() {
        return time_from;
    }

    public void setTime_from(Long time_from) {
        this.time_from = time_from;
    }

    public Long getTime_to() {
        return time_to;
    }

    public void setTime_to(Long time_to) {
        this.time_to = time_to;
    }

    public Long getMeeting_id_meeting() {
        return meeting_id_meeting;
    }

    public void setMeeting_id_meeting(Long meeting_id_meeting) {
        this.meeting_id_meeting = meeting_id_meeting;
    }

    public Long getLook_or_offer() {
        return look_or_offer;
    }

    public void setLook_or_offer(Long look_or_offer) {
        this.look_or_offer = look_or_offer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}