package com.capg.sm.springboot.capgtopics;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapgTopicsController {

	
	@RequestMapping("/myController")
	public String display()
	{
		return "My Controller";
	}
	
	@RequestMapping("/capgtopics")
	public List<CapgTopics> getAllTopics()
	{
		return Arrays.asList(new CapgTopics("SpringBoot","SpringMVC","Spring"),
				
				new CapgTopics("JPA","Hibernate","Spring"),
				new CapgTopics("UI","React","Facebook")
				);
	}
}
