package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Long> {

}