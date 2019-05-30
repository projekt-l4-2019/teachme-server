package pl.example.DTO;

import java.sql.Date;
import java.sql.Timestamp;

public class UserDTO {

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

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getTimesstamp() {
        return timesstamp;
    }

    public void setTimesstamp(Timestamp timesstamp) {
        this.timesstamp = timesstamp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCityIdCity() {
        return cityIdCity;
    }

    public void setCityIdCity(int cityIdCity) {
        this.cityIdCity = cityIdCity;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }
}
