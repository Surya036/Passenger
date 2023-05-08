package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.login_page;
import com.example.demo.Service.login_service;


@RestController
public class login_controller {
@Autowired 
login_service logserve;
@PostMapping("/checklog")
	public String validateUser(@RequestBody Map<String, String> logindata)
	{
		String uname=logindata.get("username");
		String pwd=logindata.get("password");
		String result=logserve.checklogin(uname, pwd);
		return result;
		
	}
@PostMapping("/adduser")
public login_page getuser(@RequestBody login_page u)
{
return logserve.addUser(u);
}
@GetMapping("/get")
public List<login_page> listAll()
{
	return logserve.getUser();
}
}