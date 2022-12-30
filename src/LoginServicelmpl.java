package com.training.test.service;

import java.util.List;

import com.training.test.model.Product;
import com.training.web.dao.LoginDaoImpl;


public class LoginServicelmpl {
	LoginDaoImpl dao = new LoginDaoImpl();

	public boolean isValidUser(String username, String password) {
		
		boolean isValid = false;
		List<Product> prodList = dao.getUsers();
		for (Product user : prodList) {
			if (user.getName().equals(username) && user.getDesc().equals(password)) {
				isValid = true;
			}
		}
		return isValid;
	}
	
	public List<Product> getUsers() {
		List<Product> prodList = dao.getUsers();
		return prodList;
	}

}

