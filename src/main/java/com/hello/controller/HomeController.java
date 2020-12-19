package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class HomeController {
	String message = "Welcome to Spring MVC!";
	@RequestMapping(value ="/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Rajendra")String name) {
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	@RequestMapping(value ="/hello", method =RequestMethod.POST)
	public ModelAndView showGreet(@Validated Info info) {
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("username",info.getUsername());
		mv.addObject("password", info.getPassword());
		return mv;
	}

}