package com.example.Repository;

import com.example.Model.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPreferenceRepository extends JpaRepository<Preference, Long> {

}