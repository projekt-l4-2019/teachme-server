package pl.example.models;

import javax.persistence.*;

@Entity
@Table(name = "opinion", schema = "public", catalog = "d2b6rsc8m7io0b")
public class OpinionEntity {
    private int idOpinion;
    private int rating;
    private String comment;

    @Id
    @Column(name = "id_opinion")
    public int getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(int idOpinion) {
        this.idOpinion = idOpinion;
    }

    @Basic
    @Column(name = "rating")
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpinionEntity that = (OpinionEntity) o;

        if (idOpinion != that.idOpinion) return false;
        if (rating != that.rating) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOpinion;
        result = 31 * result + rating;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
