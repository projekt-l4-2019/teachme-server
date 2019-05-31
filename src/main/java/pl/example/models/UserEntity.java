package pl.example.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "userr", schema = "public", catalog = "d2b6rsc8m7io0b")
public class UserEntity {
    private Integer idUser;
    private String login;
    private String name;
    private String surname;
    private Date birthDate;
    private byte[] avatar;
    private String phone;
    private String email;
    private Timestamp timesstamp;
    private String password;
    private int cityIdCity;
    private String about;
    private int idCity;
    private Collection<MeetingEntity> meetingsByIdUser;
    private Collection<NoticeEntity> noticesByIdUser;
    private Collection<OpinionEntity> opinionsByIdUser;
    private Collection<OpinionEntity> opinionsByIdUser_0;
    private CityEntity cityByCityIdCity;

    public UserEntity() {
    }

    public UserEntity(Integer idUser, String login, String name, String surname, Date birthDate, byte[] avatar, String phone, String email, Timestamp timesstamp, String password, int cityIdCity, String about, int idCity, Collection<MeetingEntity> meetingsByIdUser, Collection<NoticeEntity> noticesByIdUser, Collection<OpinionEntity> opinionsByIdUser, Collection<OpinionEntity> opinionsByIdUser_0, CityEntity cityByCityIdCity) {
        this.idUser = idUser;
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.avatar = avatar;
        this.phone = phone;
        this.email = email;
        this.timesstamp = timesstamp;
        this.password = password;
        this.cityIdCity = cityIdCity;
        this.about = about;
        this.idCity = idCity;
        this.meetingsByIdUser = meetingsByIdUser;
        this.noticesByIdUser = noticesByIdUser;
        this.opinionsByIdUser = opinionsByIdUser;
        this.opinionsByIdUser_0 = opinionsByIdUser_0;
        this.cityByCityIdCity = cityByCityIdCity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
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
    @Column(name = "birth_date", nullable = false)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "avatar", nullable = true)
    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
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
    @GeneratedValue
    @Value("1")
    @Column(name = "city_id_city", nullable = true, insertable = false, updatable = false)
    public int getCityIdCity() {
        return cityIdCity;
    }

    public void setCityIdCity(int cityIdCity) {
        this.cityIdCity = cityIdCity;
    }

    @Basic
    @Column(name = "about", nullable = true)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "id_city", nullable = true)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idUser != that.idUser) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        //if (!Arrays.equals(avatar, that.avatar)) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (timesstamp != null ? !timesstamp.equals(that.timesstamp) : that.timesstamp != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
       // if (cityIdCity != null ? !cityIdCity.equals(that.cityIdCity) : that.cityIdCity != null) return false;
        if (about != null ? !about.equals(that.about) : that.about != null) return false;
      //  if (idCity != null ? !idCity.equals(that.idCity) : that.idCity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
       // result = 31 * result + Arrays.hashCode(avatar);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (timesstamp != null ? timesstamp.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
       // result = 31 * result + (cityIdCity != null ? cityIdCity.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
       // result = 31 * result + (idCity != null ? idCity.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserIdUser")
    public Collection<MeetingEntity> getMeetingsByIdUser() {
        return meetingsByIdUser;
    }

    public void setMeetingsByIdUser(Collection<MeetingEntity> meetingsByIdUser) {
        this.meetingsByIdUser = meetingsByIdUser;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserIdUser")
    public Collection<NoticeEntity> getNoticesByIdUser() {
        return noticesByIdUser;
    }

    public void setNoticesByIdUser(Collection<NoticeEntity> noticesByIdUser) {
        this.noticesByIdUser = noticesByIdUser;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserIdUser")
    public Collection<OpinionEntity> getOpinionsByIdUser() {
        return opinionsByIdUser;
    }

    public void setOpinionsByIdUser(Collection<OpinionEntity> opinionsByIdUser) {
        this.opinionsByIdUser = opinionsByIdUser;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userByUserIdUser1")
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
