package pl.example.models;

import javax.persistence.*;

@Entity
@Table(name = "adminn", schema = "public", catalog = "d2b6rsc8m7io0b")
public class AdminEntity {
    private int idAdmin;
    private String login;
    private String pasword;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin", nullable = false)
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 127)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "pasword", nullable = false, length = 4000)
    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 127)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (idAdmin != that.idAdmin) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (pasword != null ? !pasword.equals(that.pasword) : that.pasword != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAdmin;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (pasword != null ? pasword.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
