package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LogModel;


public interface UserRepository extends JpaRepository<LogModel, Integer> {

}