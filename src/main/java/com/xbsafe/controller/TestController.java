package com.xbsafe.controller;

import com.xbsafe.sqlDB.bean.User;
import com.xbsafe.sqlDB.service.UserService;
import com.xbsafe.webservice.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
public class TestController {
	@Autowired
	UserService userService;

	@Autowired
	DemoService demoService;
	
	@RequestMapping("/userService")
	@ResponseBody
	public String userService(){
		System.out.println("==============");
		User u = userService.getUser("test01");
		System.out.println(u.getName());
		return u.getName() + "------>" + u.getAge();
	}
	
	
	@RequestMapping("/userService2")
	@ResponseBody
	public String userService2(){
		System.out.println("==============");
		User u = userService.getUser2("test01");
		System.out.println(u.getName());
		return u.getName() + "------>" + u.getAge();
	}

	@RequestMapping("/demoService")
	@ResponseBody
	public String demoService(){
		System.out.println("==============");
		return demoService.test("您好！");
	}
}
