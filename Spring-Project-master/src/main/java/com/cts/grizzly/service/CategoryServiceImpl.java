package com.cts.grizzly.service;

import java.util.List;

import com.cts.grizzly.bean.Category;
import com.cts.grizzly.dao.CategoryDAO;
import com.cts.grizzly.dao.CategoryDAOImpl;

public class CategoryServiceImpl implements CategoryService {
	CategoryDAO dao = new CategoryDAOImpl();
	
	@Override
	public List<Category> getCategory() {
		return  dao.getCategory();
	}

}
