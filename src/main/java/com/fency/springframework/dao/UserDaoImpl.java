package com.fency.springframework.dao;

import org.springframework.stereotype.Repository;
import com.fency.springframework.entity.User;

import java.util.Collections;
import java.util.List;

@Repository
public class UserDaoImpl {

    /**
     * init.
     */
    public UserDaoImpl() {
    }

    /**
     * mocked to find user list.
     *
     * @return user list
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("fency", 18));
    }
}