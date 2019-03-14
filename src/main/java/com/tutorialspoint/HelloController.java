package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(value="/world", method= RequestMethod.GET)
	public String helloworld(ModelMap model) {
		 model.addAttribute("message", "Hello Spring MVC Framework!");
	     return "hello";
		
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(ModelMap model) {
		model.addAttribute("message","中文行吗？");
		return "hello";
		
		
	}
	

}
