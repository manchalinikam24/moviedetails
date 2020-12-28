package com.example.labbook.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.labbook.entity.Movie;
import com.example.labbook.service.MovieServiceInterface;


@RestController
public class MovieController {
	
	@Autowired
	MovieServiceInterface service;
	
	//Create Profile
		@PostMapping("createMovie")
		public Movie createMovie(@RequestBody Movie newemp) {
			return service.addNewMovie(newemp);
		}
		
		//Edit profile
		@PutMapping("editProfilefacebook")
		public int updateMovie(@RequestBody Movie e, @PathParam(value = "name") String name, @PathParam(value = "location") String location, @PathParam(value = "rdate") String rdate) throws Exception {
			List<Movie> emp =  service.viewMovieByName(name);
			
			if(e.getName() == null || e.getName().isEmpty()) e.setName(e.getName());
			if(e.getLocation() == null || e.getLocation().isEmpty()) e.setLocation(e.getLocation());
//		
			e.setName(name);
			e.setLocation(location);
			e.setRdate(rdate);
			return service.editMovie(location, rdate, name);
		}
		
//		//Edit profile
//		@PutMapping("editMovie")
//		public Movie updateMovie(@RequestBody Movie e, @PathParam(value = "name") String name) throws Exception {
//			List<Movie> emp =  service.viewMovieByName(name);
//			
//			if(e.getName() == null || e.getName().isEmpty()) e.setName(e.getName());
//			if(e.getLocation() == null || e.getLocation().isEmpty()) e.setLocation(e.getLocation());
//		
//			e.setName(name);
//			
//			return service.editMovie(e);
//		}
//		
		
		//Search profile by name
		@GetMapping("searchMovie")
		public List<Movie> getMovieByName(@PathParam(value = "name") String name) throws Exception {
			List<Movie> emp =  service.viewMovieByName(name);
			
			return emp;
		}
		
		//Delete profile by id
		@DeleteMapping("deleteMovie")
		public void deleteMovieById(@PathParam(value = "id") long id) throws Exception {
			
			service.deleteMovieById(id);
		}
		
		@DeleteMapping("deleteMovieName")
		public int deleteByname(@PathParam(value = "name") String name) throws Exception {
			
			return service.deleteByName(name);
		}
		
		

}
