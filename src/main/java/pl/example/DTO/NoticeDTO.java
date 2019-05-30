package pl.example.DTO;

import java.sql.Date;
import java.sql.Timestamp;

public class NoticeDTO {

    private Integer idNotice;
    private Character lookOrOffer;
    private String note;
    private String meetingPlace;
    private Date meetingDate;
    private Double price;
    private int level;
    private Character active;
    private Timestamp timestamp;
    private Integer userIdUser;
    private Timestamp timeFrom;
    private Timestamp timeTo;

    public int getSubjectIdSubject() {
        return subjectIdSubject;
    }

    public void setSubjectIdSubject(int subjectIdSubject) {
        this.subjectIdSubject = subjectIdSubject;
    }

    public int getMeetingIdMeeting() {
        return meetingIdMeeting;
    }

    public void setMeetingIdMeeting(int meetingIdMeeting) {
        this.meetingIdMeeting = meetingIdMeeting;
    }

    private int subjectIdSubject;
    private int meetingIdMeeting;
    public Integer getIdNotice() {
        return idNotice;
    }

    public void setIdNotice(Integer idNotice) {
        this.idNotice = idNotice;
    }

    public Character getLookOrOffer() {
        return lookOrOffer;
    }

    public void setLookOrOffer(Character lookOrOffer) {
        this.lookOrOffer = lookOrOffer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }

    public Timestamp getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Timestamp timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Timestamp getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Timestamp timeTo) {
        this.timeTo = timeTo;
    }
}
