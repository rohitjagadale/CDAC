package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mandatory class level annotation to specify class: spring bean: req handling controller (Handler)
public class HomeController {
	public HomeController() {
		System.out.println("In home ctor " + getClass());
	}
	
	//add req handling mtd to display welcome msg to client
	//mandatory mtd level annotation => can intercept any HTTP req(get/post/put/patch/delete/paste)
	@RequestMapping("/") // service
	//HandlerMapping bean Key : /test1
						//value : com.app.controller.TestController.testMe1
	public String testIndex() {
		System.out.println("in testIndex mtd");
		return "/index"; // AVN: /WEB-INF/views/display.jsp(Handler sends AVN ---> Dispatcher)
	}
}
