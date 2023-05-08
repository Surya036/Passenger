package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoanAppModel;
import com.example.demo.Model.LogModel;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.loanApplicationRepository;

@Service
public class loanService {

	@Autowired
	public loanApplicationRepository ls;
	public LoanAppModel save(LoanAppModel m)
	{
		return ls.save(m);
	}
	public List<LoanAppModel> getloan()
	{
		return ls.findAll();
	}
	public LoanAppModel update(LoanAppModel m)
	{
		return ls.saveAndFlush(m);
	}
	public void delete(int m)
	{
		ls.deleteById(m);
	}
	@Autowired
	public UserRepository lr;
	public LogModel save1(LogModel m)
	{
		return lr.save(m);
	}
	public List<LogModel> getloan1()
	{
		return lr.findAll();
	}
	public LogModel update1(LogModel m)
	{
		return lr.saveAndFlush(m);
	}
	public void delete1(int c)
	{
		ls.deleteById(c);
	}

}