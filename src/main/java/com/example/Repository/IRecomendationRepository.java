
package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Recomendation;

@Repository
public interface IRecomendationRepository extends JpaRepository<Recomendation, Long> {
    
}