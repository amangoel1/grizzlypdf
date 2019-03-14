package com.cts.grizzly.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

	 @Autowired
	 private SessionFactory sessionFactory;
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(product);
		return "success";
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> filterProducts(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
