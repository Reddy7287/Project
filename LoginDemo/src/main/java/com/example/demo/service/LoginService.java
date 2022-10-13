package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public String validate(String userName, String password) {
		if(userName.equals(password))
		return "Login Success";
		else
		return "Login Failed, Invalid Credentials";
	}
}
