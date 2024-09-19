package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.example.Model.User;

@Repository

public interface IUserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
