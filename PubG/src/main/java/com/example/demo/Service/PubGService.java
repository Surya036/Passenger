package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.Model.pubG;
import com.example.demo.Repository.pubGRepo;


@Service
public class PubGService {
	//JPQL -> Java Persistence Query Language
	@Autowired
	 pubGRepo frep;
	
	
	public List<pubG> getData() {
		return frep.findAll();
	}

	public pubG postData(pubG f) {
		return frep.save(f);
	}

	public List<pubG> sortData(String field) {
		return frep.findAll(Sort.by(Direction.DESC,field));
	}

	public Page<pubG> pagingFF(int offset, int noOfRecords) {
		Pageable paging=PageRequest.of(offset, noOfRecords);
		Page<pubG> pData=frep.findAll(paging);
		return pData;
	}
	public List<pubG> pagingByList(int offset, int noOfRecords) {
		Pageable paging=PageRequest.of(offset, noOfRecords);
		Page<pubG> pData=frep.findAll(paging);
		return pData.getContent();
	}

	public List<pubG> pagingByAsc(int offset, int noOfRecords, String field) {
		Pageable paging=PageRequest.of(offset, noOfRecords).withSort(Sort.by(field));
		Page<pubG> pData=frep.findAll(paging);
		return pData.getContent();
	}

	public List<pubG> pagingByDesc(int offset, int noOfRecords, String field) {
		Pageable paging=PageRequest.of(offset, noOfRecords).withSort(Sort.by(Direction.DESC,field));
		Page<pubG> pData=frep.findAll(paging);
		return pData.getContent();
	}
}

