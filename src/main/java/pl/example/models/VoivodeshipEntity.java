package pl.example.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "voivodeship", schema = "public", catalog = "d2b6rsc8m7io0b")
public class VoivodeshipEntity {
    private int idVoivodeship;
    private String nameVoivodeship;
    private Collection<CityEntity> citiesByIdVoivodeship;

    @Id
    @Column(name = "id_voivodeship", nullable = false)
    public int getIdVoivodeship() {
        return idVoivodeship;
    }

    public void setIdVoivodeship(int idVoivodeship) {
        this.idVoivodeship = idVoivodeship;
    }

    @Basic
    @Column(name = "name_voivodeship", nullable = false, length = 127)
    public String getNameVoivodeship() {
        return nameVoivodeship;
    }

    public void setNameVoivodeship(String nameVoivodeship) {
        this.nameVoivodeship = nameVoivodeship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoivodeshipEntity that = (VoivodeshipEntity) o;

        if (idVoivodeship != that.idVoivodeship) return false;
        if (nameVoivodeship != null ? !nameVoivodeship.equals(that.nameVoivodeship) : that.nameVoivodeship != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVoivodeship;
        result = 31 * result + (nameVoivodeship != null ? nameVoivodeship.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "voivodeshipByVoivodeshipIdVoivodeship")
    public Collection<CityEntity> getCitiesByIdVoivodeship() {
        return citiesByIdVoivodeship;
    }

    public void setCitiesByIdVoivodeship(Collection<CityEntity> citiesByIdVoivodeship) {
        this.citiesByIdVoivodeship = citiesByIdVoivodeship;
    }
}
