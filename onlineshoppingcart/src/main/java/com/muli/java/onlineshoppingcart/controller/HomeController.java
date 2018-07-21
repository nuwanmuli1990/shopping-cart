package com.muli.java.onlineshoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value= {"/", "/index", "/Home"})
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", "Welcome to MVC ");
		mv.addObject("isHomePage", true);
		return mv;
	}
	
	@RequestMapping(value="/About")
	public ModelAndView aboutUs() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", "Welcome to MVC ");
		mv.addObject("isAboutPage", true);
		return mv;
	}
	
	
	@RequestMapping(value="/Contact")
	public ModelAndView contactUs() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", "Welcome to MVC ");
		mv.addObject("isContactPage", true);
		return mv;
	}

}
