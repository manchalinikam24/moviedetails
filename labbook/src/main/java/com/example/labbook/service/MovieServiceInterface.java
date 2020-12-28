package com.example.labbook.service;

import java.util.List;

import com.example.labbook.entity.Movie;

public interface MovieServiceInterface {
	
	public Movie addNewMovie(Movie mov);
	public Movie editMovie(Movie mov);
	public void deleteMovieById(long id);
	
	public List<Movie> viewMovieByName(String name);
	int editMovie(String location, String rdate, String name);

	int deleteByName(String name);
}
