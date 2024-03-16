package com.itcorp.moviemgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itcorp.moviemgr.model.Movie;

public interface MovieRepository 
	extends JpaRepository<Movie, Integer>{

}
