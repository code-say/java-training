package com.capg.sm.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//request from browser
@RestController
public class MyController {
	
	@RequestMapping("/myController")
	public String display()
	{
		return "My Controller";
	}

}
