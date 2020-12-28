package com.example.labbook.dao;

import org.springframework.stereotype.Repository;

import com.example.labbook.entity.Movie;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Long> {

	List<Movie> findByName(String name);
	
	@Transactional
	@Modifying
	@Query("update com.example.labbook.entity.Movie c set c.location=:location,c.rdate=:rdate where c.name=:name")
    int updateProfile(String location,String rdate,String name);
	
	@Transactional
	@Modifying
	@Query("delete Movie m where m.name=name")
	int deleteByname(String name);
	

}
