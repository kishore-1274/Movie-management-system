package com.example.demo.service;

import java.util.List;

import com.example.demo.Model.Movie;

public interface serviceinterface {

	Movie insertMovie(Movie movie);

	List<Movie> movieByGenre(String genre);

	List<Movie> movieByName(String name);

	List<Movie> findAll();

	List<Movie> getByNameAndBudget(String name, long budget);

	List<Movie> getByReview(double review);

	List<Movie> getbyNameOrBudget(String name, long budget);

	List<Movie> sortBy();

	String deleteMovieByName(String name);

	Movie updateMovieByName(Movie movie, String name);

	



	


	


	
	
	




	
	

	
	



	
	

	
	

}

