package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Place;

@Repository
public interface IPlaceRepository extends JpaRepository<Place, Long> {

}