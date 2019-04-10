package com.cts.homeservice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.service.AdminService;
//import com.cts.homeservice.service.LocationService;
import com.cts.homeservice.service.RequestsService;
import com.cts.homeservice.service.WorkerService;

@Controller
public class AdminController {
	
	@Autowired
	private RequestsService requestsService;
	
	@Autowired
	private AdminService adminService;
	
//	@Autowired
//	private LocationService locationService;
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping("adminPanelProfile.html")
	public String adminPanelProfile() {
		return "adminPanelProfile";
	}

	@GetMapping("adminPanel.html")
	public String getAdminPanel() {
		return "adminPanel";
	}
	
	@GetMapping("adminPanelRequest.html")
	public ModelAndView getRequestPage() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("requestList",requestsService.getAllRequests());
		
		modelAndView.setViewName("adminPanelRequest");
		return modelAndView;
	}
	
	@GetMapping("adminPanelService.html")
	public String adminPanelService() {
		return "adminPanelService";
	}
	
	
	@PostMapping("addService.html")
	public ModelAndView addService(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		
		
		return modelAndView;
		
		
	}
	
	@PostMapping("updateAdmin.html")
	public ModelAndView updateAdmin(@ModelAttribute Admin newAdmin, HttpServletRequest request, HttpSession httpSession) {
		//int workerId = Integer.parseInt(request.getParameter("workerId"));
		ModelAndView modelAndView = new ModelAndView();
		httpSession = request.getSession(false);
		Admin admin = (Admin) httpSession.getAttribute("admin");
		
		//System.out.println(admin);
		newAdmin.setAdminId(admin.getAdminId());
		if(admin.getPwd().equals(newAdmin.getPwd()))
		{
			int status = adminService.updateAdmin(newAdmin);
			if(status == 1)
			{
				modelAndView.setViewName("adminPanel");
				System.out.println("success");
			}
		}
		else
		{
			modelAndView.setViewName("adminPanel");
			System.out.println("failure");
			
		}
		
		
		//System.out.println(workerId + "worker");
		
		return modelAndView;
	}
	
//	@GetMapping("adminAssignTask.html")
//	public ModelAndView getAdminAssignTask(@RequestParam("requestId") int requestId) throws JSONException, IOException, ParseException {
//		ModelAndView modelAndView = new ModelAndView();
//		
//		//modelAndView.addObject("workerList",);
//
//		Requests requests = requestsService.getRequestById(requestId);
//		
//		String locality = requests.getLocality();
//		String serviceType = requests.getServiceType();
//		String latLong = locationService.getLatLong(locality);
//		String vicinity = locationService.getVicinity(latLong).trim();
//		List<Worker> workers = workerService.getWorkerByLocalityAndService(vicinity,serviceType);
//		System.out.println(workers);
//		modelAndView.addObject("workerList", workers);		
//		
//		modelAndView.setViewName("adminAssignTask");
//		return modelAndView;
//	}
	
	@PostMapping("adminAssignTask.html")
	public ModelAndView assignWorker(HttpServletRequest request) {
		int workerId = Integer.parseInt(request.getParameter("workerId"));
		
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(workerId + "wrpker");
		modelAndView.setViewName("adminAssignTask");
		return modelAndView;
	}
}
