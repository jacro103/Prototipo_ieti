package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Review;

@Repository

public interface IReviewRepository extends JpaRepository<Review, Long> {
    
}
