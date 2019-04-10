package com.cts.homeservice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.homeservice.bean.Worker;
import com.cts.homeservice.service.WorkerService;

@Controller
public class WorkerController {

	@Autowired
	private WorkerService workerService;
	
	@GetMapping("viewWorkerProfile.html")
	public ModelAndView viewWorkerProfile(@RequestParam("workerId") int workerId ) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("worker", workerService.getWorkerById(workerId));
		
		modelAndView.setViewName("viewWorkerProfile");
		
		return modelAndView;
		
		
	}
	
	@GetMapping("workerPanelProfile.html")
	public ModelAndView viewWorkerPanelProfile(HttpSession session, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		session = request.getSession(false);
		Worker worker = (Worker)session.getAttribute("worker");
		modelAndView.addObject("worker", workerService.getWorkerById(worker.getWorkerId()));
		return modelAndView;
	}
}
