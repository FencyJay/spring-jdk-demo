package com.fency.springframework;

import org.springframework.aop.framework.DefaultAopProxyFactory;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigBeanDefinitionParser;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.fency.springframework.entity.User;
import com.fency.springframework.service.UserServiceImpl;

import java.util.List;


public class App {

    /**
     * main interfaces.
     *
     * @param args args
     */
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context =
                new FileSystemXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(BeansConfig.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext("tech.pdai.springframework");
//        BeanDefinition
        // retrieve configured instance
//        UserServiceImpl service = context.getBean(UserServiceImpl.class);
        UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);
        // use configured instance
        List<User> userList = service.findUserList();

        // print info from beans
        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}