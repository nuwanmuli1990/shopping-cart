package com.muli.java.onlineshoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.muli.java.shoppingcartbackend.dao.CategoryDAO;


@Controller
public class HomeController {

	@Autowired
	private CategoryDAO CategoryDaoImpl;
	
	@RequestMapping(value= {"/", "/index", "/Home"})
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "Welcome to MVC ");
		mv.addObject("isHomePage", true);
		mv.addObject("categories", CategoryDaoImpl.getCategoryList());
		return mv;
	}
	
	@RequestMapping(value="/About")
	public ModelAndView aboutUs() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "Welcome to MVC ");
		mv.addObject("isAboutPage", true);
		return mv;
	}
	
	
	@RequestMapping(value="/Contact")
	public ModelAndView contactUs() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "Welcome to MVC ");
		mv.addObject("isContactPage", true);
		return mv;
	}
	
	
	@RequestMapping(value= "/All/Products")
	public ModelAndView showAllProducts() {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "ALL Products");
		mv.addObject("isAllProducts", true);
		mv.addObject("categories", CategoryDaoImpl.getCategoryList());
		return mv;
	}
	
	@RequestMapping(value= "/Category/{id}/Products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "Category Products");
		mv.addObject("isCategoryProducts", true);
		mv.addObject("categories", CategoryDaoImpl.getCategoryList());
		mv.addObject("category", CategoryDaoImpl.getCategory(id));
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
