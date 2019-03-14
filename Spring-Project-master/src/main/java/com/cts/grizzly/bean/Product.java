package com.cts.grizzly.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	private String productId;
	private String name;
	private String price;
	private String description;
	private String brand;
	private String category;
private int rating;
	
	public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column
	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column
	public String getName() {
		return name;
	}


	public void setName(String productName) {
		this.name = productName;
	}

@Column
	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}

@Column
	public String getQuantity() {
		return description;
	}


	public void setQuantity(String quantity) {
		this.description = quantity;
	}

	
	
@Column
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	
	
	@Column
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", description="
				+ description + ", brand=" + brand + ", category=" + category + ", rating="+ rating+ "]";
	}
	

	
	
	
}
