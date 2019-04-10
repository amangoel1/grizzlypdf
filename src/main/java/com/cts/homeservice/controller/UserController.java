package com.cts.homeservice.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.homeservice.bean.Requests;
import com.cts.homeservice.bean.User;
import com.cts.homeservice.service.RequestsService;


@Controller
public class UserController {

	@Autowired
	private RequestsService requestsService;
	
	@GetMapping("userPanel.html")
	public String getUserPanel() {
		return "userPanel";
	}
	
	@RequestMapping(value="userPanelProfile.html", method=RequestMethod.GET)
	public String getUserPanelProfile()
	{
		return "userPanelProfile";
	}
	
	
	
	@RequestMapping(value="userRequestStatus.html", method=RequestMethod.GET)
	public ModelAndView getUserRequestStatus(HttpSession session, HttpServletRequest request)
	{
		session = request.getSession(false);
		ModelAndView modelAndView = new ModelAndView();
		User user = (User)session.getAttribute("user");
		modelAndView.addObject("requestList", requestsService.getRequestsByUser(user.getUserId()));
		modelAndView.setViewName("userRequestStatus");
		return modelAndView;
		
		
		
	}
	

	@RequestMapping(value="request.html", method=RequestMethod.GET)
	public ModelAndView getRequestPage(@RequestParam("service")String service)
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("service", service);
		modelAndView.setViewName("request");
		return modelAndView;
	}
	
	@PostMapping("request.html")
	public ModelAndView addServiceRequest(@ModelAttribute Requests requests, HttpSession session, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String time = request.getParameter("fromTime") + " "+ request.getParameter("toTime");
		int userId = Integer.parseInt(request.getParameter("userId"));
		requests.setTime(time);
		System.out.println(userId+"userid");
		requests.setUserId(userId);
		String date = request.getParameter("date");
		
		int id = requestsService.getLastRequestId();
		requests.setRequestId(id+1);
		
		String result  = requestsService.addRequest(requests);
		
		if("success".equals(result)) {
			
			modelAndView.addObject("requestList", requestsService.getRequestsByUser(userId));
			modelAndView.setViewName("userRequestStatus");
			
		}
			
		else
			modelAndView.setViewName("request");
		
		
		return modelAndView;
	}
	
	
}
