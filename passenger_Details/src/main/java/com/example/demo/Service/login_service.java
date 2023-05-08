package com.example.demo.Service;
//
//import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.demo.Model.login_page;
import com.example.demo.repository.login_repo;

@Service
public class login_service {
	@Autowired
	public login_repo ur;  
	public String checklogin(String uname,String pwd)
	{
		login_page user=ur.findByUsername(uname);
		if(user==null)
		{
			return "no user found";
		}
		else
		{
			if(user.getPassword().equals(pwd))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public login_page addUser(login_page s)
	{
		return ur.save(s);
	}
	public List<login_page> getUser()
	{
		return ur.findAll();
	}
}