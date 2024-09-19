package com.example.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Model.GenericResponse;
import com.example.Model.Review;
import com.example.Repository.IReviewRepository;

@Service
public class ReviewService {
    private final IReviewRepository reviewRepository;

    public ReviewService(IReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public GenericResponse<ArrayList<Review>> getReviews() {
        try {
            var list = (ArrayList<Review>) reviewRepository.findAll();
            return new GenericResponse<>(HttpStatus.OK, "OK", true, list);

        } catch (Exception exception) {
            return new GenericResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }

    public GenericResponse<Review> saveReview(Review review) {
        try {
            return new GenericResponse<>(HttpStatus.OK, "OK", true, reviewRepository.save(review));

        } catch (Exception exception) {
            return new GenericResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }

    public GenericResponse<Optional<Review>> getById(Long id) {
        try {
            return new GenericResponse<>(HttpStatus.OK, "OK", true, reviewRepository.findById(id));

        } catch (Exception exception) {
            return new GenericResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }

    public GenericResponse<Review> updateReview(Long id, Review review) {
        try {
            Optional<Review> reviewOpt = reviewRepository.findById(id);
            if (reviewOpt.isPresent()) {
                Review reviews = reviewOpt.get();
                reviews.setDate(review.getDate());
                reviews.setScore(review.getScore());
                reviews.setComment(review.getComment());
                return new GenericResponse<Review>(HttpStatus.OK, "OK", true, reviewRepository.save(review));
            } else {
                return new GenericResponse<Review>(HttpStatus.INTERNAL_SERVER_ERROR, "Usuario no encontrado",
                    false, null);
            }
        } catch (Exception exception) {
            return new GenericResponse<Review>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }

    public GenericResponse<Void> deleteReview(Long id) {
        try {
            Optional<Review> reviewOpt = reviewRepository.findById(id);
            if (reviewOpt.isPresent()) {
                reviewRepository.deleteById(id);
                return new GenericResponse<Void>(HttpStatus.OK, "OK", true, null);
            } else {
                return new GenericResponse<Void>(HttpStatus.INTERNAL_SERVER_ERROR, "Usuario no encontrado",
                false, null);
            }
        } catch (Exception exception) {
            return new GenericResponse<Void>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(),
                    false, null);
        }
    }
}

