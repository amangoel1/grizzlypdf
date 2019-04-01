package com.cts.homeservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.bean.User;
import com.cts.homeservice.service.RegisterUserService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegisterUserService registerUserService;
	
	@RequestMapping(value="registerUser.html", method=RequestMethod.POST)
	public ModelAndView validateAdmin(@ModelAttribute User register,  HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
//		String str = registerUserService.registerUser(register);
		if(registerUserService.registerUser(register).equals("success"))
		{
			modelAndView.setViewName("home");
		}
		return modelAndView;
	}

}
