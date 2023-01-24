package com.training.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.springmvc.controllar.dao.AdminDao;
import com.training.springmvc.controllar.dao.AdminDaolmpl;
import com.training.springmvc.controllar.dao.UserDao;
import com.training.springmvc.controllar.dao.UserDaoImpl;
import com.training.springmvc.controllar.model.Admin;
import com.training.springmvc.controllar.model.User;
@Service
public class LoginServiceImpl implements LoginService {
	
	public boolean isValidUser_det(String username, String password) {
		UserDao dao = new UserDaoImpl();
		boolean isValid1 = false;
		List<User> userList1 = dao.getUsers();
		for (User user : userList1) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				isValid1 = true;
			}
		}
		return isValid1;
	}
	public boolean isValidAdmin_det(String username, String password) {
		AdminDao dao1 = new AdminDaolmpl();
		boolean isValid1 = false;
		List<Admin> adminList1 = dao1.getAdmins();
		for (Admin admin : adminList1) {
			if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
				isValid1 = true;
			}
		}
		return isValid1;
	}

}

