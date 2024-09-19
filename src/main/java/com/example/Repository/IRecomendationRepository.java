package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.example.Model.Recomendation;

@Repository
public interface IRecomendationRepository extends MongoRepository<Recomendation, Long> {
}
