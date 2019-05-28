package pl.example.models;

import javax.persistence.*;

@Entity
@Table(name = "meeting_cache", schema = "public", catalog = "d2b6rsc8m7io0b")
public class MeetingCacheEntity {
    private int idUserCache;
    private String meetingPlace;
    private MeetingEntity meetingByMeetingIdMeeting;

    @Id
    @Column(name = "id_user_cache")
    public int getIdUserCache() {
        return idUserCache;
    }

    public void setIdUserCache(int idUserCache) {
        this.idUserCache = idUserCache;
    }

    @Basic
    @Column(name = "meeting_place")
    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingCacheEntity that = (MeetingCacheEntity) o;

        if (idUserCache != that.idUserCache) return false;
        if (meetingPlace != null ? !meetingPlace.equals(that.meetingPlace) : that.meetingPlace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserCache;
        result = 31 * result + (meetingPlace != null ? meetingPlace.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "meeting_id_meeting", referencedColumnName = "id_meeting", nullable = false)
    public MeetingEntity getMeetingByMeetingIdMeeting() {
        return meetingByMeetingIdMeeting;
    }

    public void setMeetingByMeetingIdMeeting(MeetingEntity meetingByMeetingIdMeeting) {
        this.meetingByMeetingIdMeeting = meetingByMeetingIdMeeting;
    }
}
