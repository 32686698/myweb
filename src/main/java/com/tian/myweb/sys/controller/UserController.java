package com.tian.myweb.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tian.myweb.sys.service.UserService;

@Controller
public class UserController {
	
	@Autowired(required=true)
	private UserService userService;
	
	@RequestMapping(value="/j_spring_security_check")  // 请求url地址映射，类似Struts的action-mapping
    public String login(@RequestParam("j_username")String username, @RequestParam("j_password")String pwd ,HttpServletRequest request) {
        // @RequestParam是指请求url地址映射中必须含有的参数(除非属性required=false)
        // @RequestParam可简写为：@RequestParam("username")
		System.out.println(username+pwd);
		System.out.println(userService.findAllSysUser());
        return "main";// 跳转页面路径（默认为转发），该路径不需要包含spring-servlet配置文件中配置的前缀和后缀
    }
	
	@RequestMapping(value="/user/loginFail")  // 请求url地址映射，类似Struts的action-mapping
    public String loginFail(@RequestParam("msg")String msg, HttpServletRequest request) {
        // @RequestParam是指请求url地址映射中必须含有的参数(除非属性required=false)
        // @RequestParam可简写为：@RequestParam("username")
 
		System.out.println(msg);
		
        return "main";// 跳转页面路径（默认为转发），该路径不需要包含spring-servlet配置文件中配置的前缀和后缀
    }
	
}
