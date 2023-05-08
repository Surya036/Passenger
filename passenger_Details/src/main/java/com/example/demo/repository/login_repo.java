package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.login_page;

public interface login_repo extends JpaRepository<login_page, Integer> {
	login_page findByUsername(String username);
}
