package com.cts.grizzly.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="category")
public class Category {

	@Id
	private String id;
	private String name;
	
	@Column
	public String getId() {
		return id;
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
	public Category(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
