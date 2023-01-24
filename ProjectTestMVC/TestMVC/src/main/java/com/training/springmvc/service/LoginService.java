package com.training.springmvc.service;


public interface LoginService {
	boolean isValidUser_det(String username, String password);

	boolean isValidAdmin_det(String username, String password);

}