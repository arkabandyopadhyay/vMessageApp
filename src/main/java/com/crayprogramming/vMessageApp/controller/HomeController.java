package com.crayprogramming.vMessageApp.controller;
//	compile('org.springframework.boot:spring-boot-starter-data-jpa')

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showHome(){
		return "home.html";
	}
}
