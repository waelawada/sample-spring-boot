package com.waelawada.learn.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by waelawada on 1/16/15.
 */
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private Date joinDate;
    private Date lastLogin;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "{User:{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                ", password:'" + password + '\'' +
                ", joinDate:" + joinDate +
                ", lastLogin:" + lastLogin +
                '}';
    }
}
