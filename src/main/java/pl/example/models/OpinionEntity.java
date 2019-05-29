package pl.example.models;

import javax.persistence.*;

@Entity
@Table(name = "opinion", schema = "public", catalog = "d2b6rsc8m7io0b")
public class OpinionEntity {
    private int idOpinion;
    private int rating;
    private String comment;
    private Integer userIdUser;
    private Integer userIdUser1;
    private UserEntity userByUserIdUser;
    private UserEntity userByUserIdUser1;

    @Id
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
    @Column(name = "user_id_user", nullable = true,insertable = false, updatable = false)
    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Basic
    @Column(name = "user_id_user1", nullable = true,insertable = false, updatable = false)
    public Integer getUserIdUser1() {
        return userIdUser1;
    }

    public void setUserIdUser1(Integer userIdUser1) {
        this.userIdUser1 = userIdUser1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpinionEntity that = (OpinionEntity) o;

        if (idOpinion != that.idOpinion) return false;
        if (rating != that.rating) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (userIdUser != null ? !userIdUser.equals(that.userIdUser) : that.userIdUser != null) return false;
        if (userIdUser1 != null ? !userIdUser1.equals(that.userIdUser1) : that.userIdUser1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOpinion;
        result = 31 * result + rating;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (userIdUser != null ? userIdUser.hashCode() : 0);
        result = 31 * result + (userIdUser1 != null ? userIdUser1.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user")
    public UserEntity getUserByUserIdUser() {
        return userByUserIdUser;
    }

    public void setUserByUserIdUser(UserEntity userByUserIdUser) {
        this.userByUserIdUser = userByUserIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "user_id_user1", referencedColumnName = "id_user")
    public UserEntity getUserByUserIdUser1() {
        return userByUserIdUser1;
    }

    public void setUserByUserIdUser1(UserEntity userByUserIdUser1) {
        this.userByUserIdUser1 = userByUserIdUser1;
    }
}
