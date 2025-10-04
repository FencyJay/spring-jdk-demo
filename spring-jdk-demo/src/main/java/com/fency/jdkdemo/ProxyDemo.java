package com.fency.jdkdemo;

import com.fency.jdkdemo.proxy.UserLogProxy;

import com.fency.jdkdemo.service.UserService;
import com.fency.jdkdemo.service.UserServiceImpl;

import java.lang.reflect.Proxy;

public class ProxyDemo {

    /**
     * main interface.
     *
     * @param args args
     */
    public static void main(String[] args) {
        // proxy
        UserService userService = new UserLogProxy(new UserServiceImpl()).getLoggingProxy();

        // call methods
        userService.findUserList();
        userService.addUser();

    }
}