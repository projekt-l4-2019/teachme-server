package pl.example.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "subject", schema = "public", catalog = "d2b6rsc8m7io0b")
public class SubjectEntity {
    private int idSubject;
    private String name;
    private Collection<NoticeEntity> noticesByIdSubject;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Column(name = "id_subject", nullable = false)
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 127)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectEntity that = (SubjectEntity) o;

        if (idSubject != that.idSubject) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSubject;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "subjectBySubjectIdSubject")
    public Collection<NoticeEntity> getNoticesByIdSubject() {
        return noticesByIdSubject;
    }

    public void setNoticesByIdSubject(Collection<NoticeEntity> noticesByIdSubject) {
        this.noticesByIdSubject = noticesByIdSubject;
    }
}
