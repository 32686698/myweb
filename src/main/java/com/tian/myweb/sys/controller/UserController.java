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
	
	@RequestMapping(value="/j_spring_security_check")  // ����url��ַӳ�䣬����Struts��action-mapping
    public String login(@RequestParam("j_username")String username, @RequestParam("j_password")String pwd ,HttpServletRequest request) {
        // @RequestParam��ָ����url��ַӳ���б��뺬�еĲ���(��������required=false)
        // @RequestParam�ɼ�дΪ��@RequestParam("username")
		System.out.println(username+pwd);
		System.out.println(userService.findAllSysUser());
        return "main";// ��תҳ��·����Ĭ��Ϊת��������·������Ҫ����spring-servlet�����ļ������õ�ǰ׺�ͺ�׺
    }
	
	@RequestMapping(value="/user/loginFail")  // ����url��ַӳ�䣬����Struts��action-mapping
    public String loginFail(@RequestParam("msg")String msg, HttpServletRequest request) {
        // @RequestParam��ָ����url��ַӳ���б��뺬�еĲ���(��������required=false)
        // @RequestParam�ɼ�дΪ��@RequestParam("username")
 
		System.out.println(msg);
		
        return "main";// ��תҳ��·����Ĭ��Ϊת��������·������Ҫ����spring-servlet�����ļ������õ�ǰ׺�ͺ�׺
    }
	
}
