package pl.example.models;

import javax.persistence.*;

@Entity
@Table(name = "opinion", schema = "public", catalog = "d2b6rsc8m7io0b")
public class OpinionEntity {
    private int idOpinion;
    private int rating;
    private String comment;
    private Integer userTo;
    private Integer userFrom;
    private UserEntity userByUserTo;
    private UserEntity userByUserFrom;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opinion", nullable = false)
    public int getIdOpinion() {
        return idOpinion;
    }

    public void setIdOpinion(int idOpinion) {
        this.idOpinion = idOpinion;
    }

    @Basic
    @Column(name = "rating", nullable = false)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "comment", nullable = false, length = 500)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "user_to", nullable = true, insertable = false, updatable = false)
    public Integer getUserTo() {
        return userTo;
    }

    public void setUserTo(Integer userTo) {
        this.userTo = userTo;
    }

    @Basic
    @Column(name = "user_from", nullable = true, insertable = false, updatable = false)
    public Integer getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(Integer userFrom) {
        this.userFrom = userFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpinionEntity that = (OpinionEntity) o;

        if (idOpinion != that.idOpinion) return false;
        if (rating != that.rating) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (userTo != null ? !userTo.equals(that.userTo) : that.userTo != null) return false;
        if (userFrom != null ? !userFrom.equals(that.userFrom) : that.userFrom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOpinion;
        result = 31 * result + rating;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (userTo != null ? userTo.hashCode() : 0);
        result = 31 * result + (userFrom != null ? userFrom.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_to", referencedColumnName = "id_user")
    public UserEntity getUserByUserTo() {
        return userByUserTo;
    }

    public void setUserByUserTo(UserEntity userByUserTo) {
        this.userByUserTo = userByUserTo;
    }

    @ManyToOne
    @JoinColumn(name = "user_from", referencedColumnName = "id_user")
    public UserEntity getUserByUserFrom() {
        return userByUserFrom;
    }

    public void setUserByUserFrom(UserEntity userByUserFrom) {
        this.userByUserFrom = userByUserFrom;
    }
}
