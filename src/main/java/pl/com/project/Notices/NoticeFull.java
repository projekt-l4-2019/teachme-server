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
    private Integer user_id_user;
    private float price;
    private Integer subject_id_subject;
    private char active;
    private Date timestamp = new Date();
    private float time_from;
    private float time_to;
    private Integer meeting_id_meeting;
    private char look_or_offer;
    private String subject;

    public NoticeFull(String meeting_place, StringBuffer note, Date meeting_date, Integer user_id_user, Float price,
                      Integer subject_id_subject, char active, Date timestamp, Float time_from, Float time_to, Integer meeting_id_meeting,
                      char look_or_offer, String subject) {
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

    public NoticeFull() {
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

    public Integer getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(Integer user_id_user) {
        this.user_id_user = user_id_user;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getSubject_id_subject() {
        return subject_id_subject;
    }

    public void setSubject_id_subject(Integer subject_id_subject) {
        this.subject_id_subject = subject_id_subject;
    }

    public char getActive() {
        return active;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Float getTime_from() {
        return time_from;
    }

    public void setTime_from(Float time_from) {
        this.time_from = time_from;
    }

    public Float getTime_to() {
        return time_to;
    }

    public void setTime_to(Float time_to) {
        this.time_to = time_to;
    }

    public Integer getMeeting_id_meeting() {
        return meeting_id_meeting;
    }

    public void setMeeting_id_meeting(Integer meeting_id_meeting) {
        this.meeting_id_meeting = meeting_id_meeting;
    }

    public char getLook_or_offer() {
        return look_or_offer;
    }

    public void setLook_or_offer(char loor_or_offer) {
        this.look_or_offer = loor_or_offer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}