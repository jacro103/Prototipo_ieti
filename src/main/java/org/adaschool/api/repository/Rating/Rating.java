package main.java.org.adaschool.api.repository.Rating;

import java.util.List;

import main.java.org.adaschool.api.repository.Place.Place;
import main.java.org.adaschool.api.repository.Review.Review;

public class Rating {

    private List<Review> review;
    private Place place;

    public Rating(List<Review> review, Place place) {
        this.review = review;
        this.place = place;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

}
