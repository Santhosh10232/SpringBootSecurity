package com.demo.springsecurity.Service;

import com.demo.springsecurity.Dao.UserRepo;
import com.demo.springsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword(user)));
        return repo.save(user);
    }

}
