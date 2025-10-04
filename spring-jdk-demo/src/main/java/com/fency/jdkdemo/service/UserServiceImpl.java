package com.fency.jdkdemo.service;

import com.fency.jdkdemo.model.User;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
       // do something
    }

    @Override
    public List<User> findUserList() {
        return Collections.singletonList(new User("fency", 18));
    }

}