package com.fency.jdkdemo.service;

import com.fency.jdkdemo.model.User;

import java.util.List;

public interface UserService {
    void addUser();

    List<User> findUserList();
}
