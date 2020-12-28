package com.example.labbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.labbook.dto.MovieDTOInterface;
import com.example.labbook.entity.Movie;

@Service
public class MovieService implements MovieServiceInterface {
	
	@Autowired
	MovieDTOInterface dto;

	@Override
	public Movie addNewMovie(Movie mov) {
		return dto.addNewMovieDTO(mov);
	}

	@Override
	public int editMovie(String location, String rdate, String name) {
		return dto.editMovieDTO(location, rdate, name);
	}

	@Override
	public void deleteMovieById(long id) {
		dto.deleteMovieByIdDTO(id);
	}

	@Override
	public List<Movie> viewMovieByName(String name) {
		return dto.viewMovieByNameDTO(name);
	}

	@Override
	public Movie editMovie(Movie mov) {
		return dto.editMovieDTO(mov);
	}

	@Override
	public int deleteByName(String name) {
		return dto.deleteByNameDto(name);
		
	}
	
	

}
