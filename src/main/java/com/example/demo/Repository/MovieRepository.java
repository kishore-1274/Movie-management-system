package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByGenre(String genre);

	List<Movie> findByName(String name);

	List<Movie> findByNameAndBudget(String name, long budget);


	List<Movie> findByReview(double review);

	List<Movie> findByNameOrBudget(String name, long budget);

	

	void deleteByName(String name);




	
	
	
	
	

	
	
	

}
