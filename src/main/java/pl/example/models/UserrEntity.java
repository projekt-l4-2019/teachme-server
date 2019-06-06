package pl.example.models;

import com.fasterxml.jackson.annotation.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "userr", schema = "public", catalog = "d2b6rsc8m7io0b")
public class UserrEntity {
    private int idUser;
    private String login;
    private String name;
    private String surname;
    private Date birthDate;
    private String avatar;
    private String phone;
    private String email;
    private Timestamp timesstamp;
    private String password;
    private Integer cityIdCity;
    private String about;
    private Collection<MeetingEntity> meetingsByIdUser;
    private Collection<NoticeEntity> noticesByIdUser;
    private Collection<OpinionEntity> opinionsByIdUser;
    private Collection<OpinionEntity> opinionsByIdUser_0;
    private CityEntity cityByCityIdCity;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "login", nullable = true, length = 127)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 127)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = false, length = 127)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "birth_date", nullable = true)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "avatar", nullable = true, length = 127)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 127)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 127)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "timesstamp", nullable = true)
    public Timestamp getTimesstamp() {
        return timesstamp;
    }

    public void setTimesstamp(Timestamp timesstamp) {
        this.timesstamp = timesstamp;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 4000)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "city_id_city", nullable = true,insertable=false, updatable=false)
    public Integer getCityIdCity() {
        return cityIdCity;
    }

    public void setCityIdCity(Integer cityIdCity) {
        this.cityIdCity = cityIdCity;
    }

    @Basic
    @Column(name = "about", nullable = true, length = 127)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserrEntity that = (UserrEntity) o;

        if (idUser != that.idUser) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (timesstamp != null ? !timesstamp.equals(that.timesstamp) : that.timesstamp != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (cityIdCity != null ? !cityIdCity.equals(that.cityIdCity) : that.cityIdCity != null) return false;
        if (about != null ? !about.equals(that.about) : that.about != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (timesstamp != null ? timesstamp.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (cityIdCity != null ? cityIdCity.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userrByUserrIdUser")
    public Collection<MeetingEntity> getMeetingsByIdUser() {
        return meetingsByIdUser;
    }

    public void setMeetingsByIdUser(Collection<MeetingEntity> meetingsByIdUser) {
        this.meetingsByIdUser = meetingsByIdUser;
    }

    @OneToMany(mappedBy = "userrByUserrIdUser")
    public Collection<NoticeEntity> getNoticesByIdUser() {
        return noticesByIdUser;
    }

    public void setNoticesByIdUser(Collection<NoticeEntity> noticesByIdUser) {
        this.noticesByIdUser = noticesByIdUser;
    }

    @OneToMany(mappedBy = "userrByUserTo")
    public Collection<OpinionEntity> getOpinionsByIdUser() {
        return opinionsByIdUser;
    }

    public void setOpinionsByIdUser(Collection<OpinionEntity> opinionsByIdUser) {
        this.opinionsByIdUser = opinionsByIdUser;
    }

    @OneToMany(mappedBy = "userrByUserFrom")
    public Collection<OpinionEntity> getOpinionsByIdUser_0() {
        return opinionsByIdUser_0;
    }

    public void setOpinionsByIdUser_0(Collection<OpinionEntity> opinionsByIdUser_0) {
        this.opinionsByIdUser_0 = opinionsByIdUser_0;
    }

    @ManyToOne

    @JoinColumn(name = "city_id_city", referencedColumnName = "id_city")
    public CityEntity getCityByCityIdCity() {
        return cityByCityIdCity;
    }

    public void setCityByCityIdCity(CityEntity cityByCityIdCity) {
        this.cityByCityIdCity = cityByCityIdCity;
    }
}
