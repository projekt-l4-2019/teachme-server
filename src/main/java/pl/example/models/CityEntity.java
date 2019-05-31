package pl.example.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "city", schema = "public", catalog = "d2b6rsc8m7io0b")
public class CityEntity {
    private int idCity;
    private String name;
    private int voivodeshipIdVoivodeship;
    private VoivodeshipEntity voivodeshipByVoivodeshipIdVoivodeship;
    private Collection<UserEntity> usersByIdCity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city", nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
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
    @Column(name = "voivodeship_id_voivodeship", nullable = false,insertable = false, updatable = false)
    public int getVoivodeshipIdVoivodeship() {
        return voivodeshipIdVoivodeship;
    }

    public void setVoivodeshipIdVoivodeship(int voivodeshipIdVoivodeship) {
        this.voivodeshipIdVoivodeship = voivodeshipIdVoivodeship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (idCity != that.idCity) return false;
        if (voivodeshipIdVoivodeship != that.voivodeshipIdVoivodeship) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCity;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + voivodeshipIdVoivodeship;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "voivodeship_id_voivodeship", referencedColumnName = "id_voivodeship", nullable = false)
    public VoivodeshipEntity getVoivodeshipByVoivodeshipIdVoivodeship() {
        return voivodeshipByVoivodeshipIdVoivodeship;
    }

    public void setVoivodeshipByVoivodeshipIdVoivodeship(VoivodeshipEntity voivodeshipByVoivodeshipIdVoivodeship) {
        this.voivodeshipByVoivodeshipIdVoivodeship = voivodeshipByVoivodeshipIdVoivodeship;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cityByCityIdCity")
    public Collection<UserEntity> getUsersByIdCity() {
        return usersByIdCity;
    }

    public void setUsersByIdCity(Collection<UserEntity> usersByIdCity) {
        this.usersByIdCity = usersByIdCity;
    }
}
