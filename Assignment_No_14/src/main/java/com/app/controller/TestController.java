package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mandatory class level annotation to specify class: spring bean: req handling controller (Handler)
public class TestController {
	public TestController() {
		System.out.println("In ctor " + getClass());
	}
	
	//add req handling mtd to display welcome msg to client
	//mandatory mtd level annotation => can intercept any HTTP req(get/post/put/patch/delete/paste)
	@RequestMapping("/test1") // service
	//HandlerMapping bean Key : /test1
						//value : com.app.controller.TestController.testMe1
	public String testMe1() {
		System.out.println("in testMe1 mtd");
		return "/display"; // AVN: /WEB-INF/views/display.jsp(Handler sends AVN ---> Dispatcher)
	}
}
