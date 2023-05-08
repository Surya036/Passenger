package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class List {
	@GetMapping("get\pk")
		public List<passenger> getDetails()
		{
			return pserve.getInfo();
		}
	
}
