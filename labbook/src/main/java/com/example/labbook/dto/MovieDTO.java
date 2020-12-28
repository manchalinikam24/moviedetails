package com.example.labbook.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.labbook.dao.MovieDAO;
import com.example.labbook.entity.Movie;

@Service
public class MovieDTO implements MovieDTOInterface{

	@Autowired
	MovieDAO dao;
	
	@Override
	public Movie addNewMovieDTO(Movie mov) {
		return dao.save(mov);
	}

	@Override
	public int editMovieDTO(String location, String rdate, String name) {
		return dao.updateProfile(location, rdate, name);
	}

	@Override
	public void deleteMovieByIdDTO(long id) {
		dao.deleteById(id);
	}

	@Override
	public List<Movie> viewMovieByNameDTO(String name) {
		return dao.findByName(name);
	}

	@Override
	public Movie editMovieDTO(Movie mov) {
		
		return dao.saveAndFlush(mov);
	}

	@Override
	public int deleteByNameDto(String name) {
		return dao.deleteByname(name);
		
	}
	
}
