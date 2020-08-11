package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {

	final private GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
}
