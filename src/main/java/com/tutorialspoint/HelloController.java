package com.tutorialspoint;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	static Logger log = Logger.getLogger(HelloController.class.getName());
	@RequestMapping(value="/world", method= RequestMethod.GET)
	public String helloworld(ModelMap model) {
		log.info("loading world");
		 model.addAttribute("message", "Hello Spring MVC Framework!");
	     return "hello";
		
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(ModelMap model) {
		model.addAttribute("message","中文行吗？");
		return "hello";
		
	}
	
	@RequestMapping(value="/info", method = RequestMethod.POST)
	public String getId(@RequestParam String age,@RequestParam String name, @RequestParam String id,ModelMap model) {
		String message = age + " is id ";
		System.out.println(message);
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("id",id);
		log.warn("infofifififi RequestParam");
		return "info";
	}
	

	@RequestMapping(value="/RequestModel")
	public String ModelMap(@ModelAttribute("myStudent") StudentDao stu) {
		System.out.println(stu.getAge());
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		log.error("erro RequestModel");
		return "modelattribute";
	} 
	

}
