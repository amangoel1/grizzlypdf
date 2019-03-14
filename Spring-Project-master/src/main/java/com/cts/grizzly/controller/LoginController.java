package com.cts.grizzly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.grizzly.bean.Login;
import com.cts.grizzly.bean.Profile;
import com.cts.grizzly.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="login.html", method=RequestMethod.GET)
	
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="login.html", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Profile profile) 
	{
		ModelAndView modelAndView = new ModelAndView();
		
		Profile profile1 =loginService.authenticateUser(profile);
	if(loginService.authenticateUser(profile)!=null)
	{
		if(loginService.getUserType(profile1).equals("A")  && loginService.getUserStatus(profile1)<=3)
		{
			loginService.increaseAttempt(profile1);
			modelAndView.setViewName("Admin-AddProduct");
		String username = profile.getUserName();
		modelAndView.addObject("username",username );
		}
		else if(loginService.getUserType(profile1).equals("V")  && loginService.getUserStatus(profile1)<=3)
		{
			loginService.increaseAttempt(profile1);
			modelAndView.setViewName("Vendor-AddProduct");
		String username = profile.getUserName();
		modelAndView.addObject("username",username );
		}
		else if(loginService.getUserType(profile1).equals("U")  && loginService.getUserStatus(profile1)<=3)
		{
			loginService.increaseAttempt(profile1);
			modelAndView.setViewName("Admin-AddProduct");
		String username = profile.getUserName();
		modelAndView.addObject("username",username );
		}
	}
	else
	{
		profile1= loginService.checkUser(profile.getUserName());
		//System.out.print(profile.getUserName());
		if( profile1!=null && loginService.getUserStatus(profile1)<=3)
		{
			
			System.out.print(loginService.getUserStatus(profile1));
			loginService.increaseAttempt(profile1);
			//System.out.print(loginService.getUserStatus(profile1));
			modelAndView.setViewName("login");
			
			
		}
		else
			modelAndView.setViewName("loginError");
		
		
	}

	return modelAndView;
	}
	
}
