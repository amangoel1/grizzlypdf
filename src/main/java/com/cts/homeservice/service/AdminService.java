package com.cts.homeservice.service;


import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.bean.Service;
import com.cts.homeservice.bean.User;


public interface AdminService {
	
	public Admin authenticateAdmin(Admin login);
	public String addAdmin(Admin admin);
	public int getLastId();
	public boolean checkAdmin(String email);
	public String addNewService(Service service);
	public int updateAdmin(Admin admin);

	
	
}
