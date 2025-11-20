package com.demo.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "users")
@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;

    public void setPassword(String encode) {
        this.password = encode;
    }

    public CharSequence getPassword(User user) {
        return user.password;
    }
}
