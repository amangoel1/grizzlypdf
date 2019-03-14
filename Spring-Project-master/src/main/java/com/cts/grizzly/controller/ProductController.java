package com.cts.grizzly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.grizzly.bean.Product;
import com.cts.grizzly.service.ProductService;

@Controller
public class ProductController {
	 @Autowired
	  private ProductService productService; 

	@RequestMapping(value="Admin-AddProduct.html", method=RequestMethod.GET)
	
	public String geProductPage()
	{
		return "Admin-AddProduct";
	}
	
	@RequestMapping(value="Admin-AddProduct.html", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Product product) 
	{
		ModelAndView modelAndView = new ModelAndView();
		if("success".equals(productService.addProduct(product)))
			System.out.println("added product");
			modelAndView.setViewName("Admin-ProductLists");
		
		
		
	return modelAndView;
	}
}
	