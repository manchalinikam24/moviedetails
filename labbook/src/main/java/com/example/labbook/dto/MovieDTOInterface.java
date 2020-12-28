package com.example.labbook.dto;

import java.util.List;

import com.example.labbook.entity.Movie;


public interface MovieDTOInterface {
	
	Movie addNewMovieDTO(Movie mov);

	Movie editMovieDTO(Movie mov);

	void deleteMovieByIdDTO(long id); 
	
	List<Movie> viewMovieByNameDTO(String name);

	int editMovieDTO(String location, String rdate, String name);
	int deleteByNameDto(String name);

}
