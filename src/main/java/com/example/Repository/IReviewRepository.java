package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.example.Model.Review;

@Repository
public interface IReviewRepository extends MongoRepository<Review, Long> {
}
