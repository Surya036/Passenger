package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.passengerModel;
import com.example.demo.repository.passenger_repo;



@Service
public class passenger_service {
	@Autowired
	public passenger_repo p_repo;
	public passengerModel saveinfo(passengerModel pm)
	{
		return p_repo.save(pm);
	}
	public List<passengerModel>  getInfo()
	{
		return p_repo.findAll();
	}
	public passengerModel updateInfo (passengerModel fc)
	{
		return p_repo.saveAndFlush(fc);
	}
	public void deleteInfo(int id)
	{
		p_repo.deleteById(id);
	}
}
