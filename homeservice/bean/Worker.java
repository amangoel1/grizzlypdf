package com.cts.homeservice.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Worker {
	
	
	@Id
	String id;
	String name;
	String service;
	String status;
	int price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	public Worker(String id, String name, String service, String status, int price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.service = service;
//		this.status = status;
//		this.price = price;
//	}
	public Worker() {
		super();
	}
	
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", service=" + service + ", status=" + status + ", price="
				+ price + "]";
	}
	
	

}
