package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Tournament;

public interface TournamentRepo extends JpaRepository<Tournament,Integer>{

}
