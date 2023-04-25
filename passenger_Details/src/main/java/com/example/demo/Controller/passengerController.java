package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.passengerModel;
import com.example.demo.Service.passenger_service;
@RestController
public class passengerController {
		
		@Autowired
		public passenger_service pserve;
		
		@PostMapping("/savepk")
		public passengerModel addDetails(@RequestBody passengerModel pa)
		{
			return pserve.saveinfo(pa);
		}
		@GetMapping("/getpk")
		public List<passengerModel> getDetails()
		{
			return pserve.getInfo();
		}
		@PutMapping("/updatepk")
		public passengerModel updateDetails(@RequestBody passengerModel id)
		{
			return pserve.updateInfo(id);
		}
		@DeleteMapping("/deleteIpl/{pid}")
		public String deleteDetails(@PathVariable("pid")int passengerId)
		{
			pserve.deleteInfo(passengerId);
			return "Passenger Id "+passengerId+" Deleted";
		}
		@DeleteMapping("/deleteBYReq")
		public String deleteByRequestPara(@RequestParam("pid")int passengerId)
		{
			pserve.deleteInfo(passengerId);
			return "Passenger ID " +passengerId+" is deleted";
		}
}
