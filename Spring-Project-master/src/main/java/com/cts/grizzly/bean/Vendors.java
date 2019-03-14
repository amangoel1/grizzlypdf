package com.cts.grizzly.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="vendorInfo")
public class Vendors {

	@Id
	private String id;
	private String name;
	private String rating;
	private String contactNumber;
	private String address;
	
	public Vendors(String id, String name, String rating, String contactNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	@Column
	public String getId() {
		return id;
	}
	public Vendors() {
		super();
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Column
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Column
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
