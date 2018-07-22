package com.muli.java.shoppingcartbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.muli.java.shoppingcartbackend.dao.CategoryDAO;
import com.muli.java.shoppingcartbackend.dto.Category;

@Repository("CategoryDaoImpl")
public class CategoryDaoImpl implements CategoryDAO {

	public static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("This is a Mobile Phone");
		category.setImgUrl("car_1.png");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Computer");
		category.setDescription("This is a Computer");
		category.setImgUrl("car_2.png");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Television");
		category.setDescription("This is a Television");
		category.setImgUrl("car_3.png");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(4);
		category.setName("Fans");
		category.setDescription("This is a Mobile Phone");
		category.setImgUrl("car_1.png");
		category.setActive(true);
		
		categories.add(category);
	}
	
	
	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		for(Category cat : categories) {
			if(cat.getId() == id) {
				return cat;
			}
		}
		return null;
	}

}
