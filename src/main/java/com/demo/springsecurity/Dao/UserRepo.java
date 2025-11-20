package com.demo.springsecurity.Dao;

import com.demo.springsecurity.model.Student;
import com.demo.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
