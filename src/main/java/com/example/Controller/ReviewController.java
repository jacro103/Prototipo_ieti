package com.example.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.GenericResponse;
import com.example.Model.Review;
import com.example.Service.ReviewService;

@RestController
@RequestMapping("/review")
@CrossOrigin(origins = "http://localhost:4200")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping()
    public GenericResponse<ArrayList<Review>> getReviews() {
        return this.reviewService.getReviews();
    }

    @PostMapping()
    public GenericResponse<Review> saveReview(@RequestBody Review review) {
        return this.reviewService.saveReview(review);
    }

    @GetMapping("/{id}")
    public GenericResponse<Optional<Review>> getReview(@PathVariable Long id) {
        return this.reviewService.getById(id);
    }
}
