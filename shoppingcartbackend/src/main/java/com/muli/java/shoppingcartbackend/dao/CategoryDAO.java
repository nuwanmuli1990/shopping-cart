package com.muli.java.shoppingcartbackend.dao;

import java.util.List;

import com.muli.java.shoppingcartbackend.dto.Category;

public interface CategoryDAO {

	public List<Category> getCategoryList();
	public Category getCategory(int id);
}
