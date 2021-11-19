package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT id,first_name,last_name from users where id=(SELECT MAX(id) FROM users)",nativeQuery = true)
    User getUserWithHighestId();
}


