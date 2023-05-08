package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public List<passengerModel> sortDesc(String pname)
	{
		return p_repo.findAll(Sort.by(pname).ascending());
	}
	public List<passengerModel> sortDesc1(String pname)
	{
		return p_repo.findAll(Sort.by(pname).descending());
	}
	public List<passengerModel> paginationData (int pageno,int pagesize)
	{
		Page<passengerModel> p=p_repo.findAll(PageRequest.of(pageno, pagesize));
		return p.getContent();
	}
	public List<passengerModel> paginationAndSorting(int pageNo,int pageSize,String pname)
	{
		Page<passengerModel> p=p_repo.findAll(PageRequest.of(pageNo, pageSize,Sort.by(pname).ascending()));
		return p.getContent();
		
	}
}
