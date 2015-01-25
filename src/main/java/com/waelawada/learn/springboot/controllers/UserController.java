package com.waelawada.learn.springboot.controllers;

import com.waelawada.learn.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/{id}")
    public String index(@PathVariable Long id) {
        return userDao.findOne(id).toString();
    }

}