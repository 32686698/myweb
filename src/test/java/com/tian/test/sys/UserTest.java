package com.tian.test.sys;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tian.myweb.sys.model.UserModel;
import com.tian.myweb.sys.service.UserService;

public class UserTest {
	 
private UserService userService;
     
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:/config/spring/spring-context.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void addUser(){
        UserModel user = new UserModel();
        user.setUsername("ÄãºÃ");
        user.setPassword("aaa");
        userService.insertUser(user);
    }
}