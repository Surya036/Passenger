package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.passengerModel;

public interface passenger_repo extends JpaRepository<passengerModel, Integer> {

}
