package main.java.org.adaschool.api.repository.Review;

import main.java.org.adaschool.api.repository.User.User;
import main.java.org.adaschool.api.repository.Place.Place;

public class Review {

    private Date date;
    private Integer score;
    private String comment;
    private User User;
    private Place Place;

    public Review(Date date, Integer score, String comment, User user, Place place) {
        this.date = date;
        this.score = score;
        this.comment = comment;
        User = user;
        Place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        User = user;
    }

    public Place getPlace() {
        return Place;
    }

    public void setPlace(Place place) {
        Place = place;
    }

}
