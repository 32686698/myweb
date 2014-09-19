package com.tian.test.sys;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tian.myweb.sys.domain.SysUser;
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
    	SysUser user = new SysUser();
        user.setUsername("你好");
        user.setPassword("bbb");
        userService.insertSysUser(user);
    }
}