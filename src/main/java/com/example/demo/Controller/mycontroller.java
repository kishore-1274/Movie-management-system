package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Movie;
import com.example.demo.service.serviceinterface;

import jakarta.transaction.Transactional;



@RestController

@CrossOrigin(origins = "http://localhost:4200")

public class mycontroller {

	@Autowired
	private serviceinterface service;
	
	@PostMapping("/movies")
	public Movie insertMovie(@RequestBody Movie movie) {
		return service.insertMovie(movie);
	}
	 @GetMapping("/movies/genre/{genre}")
	public List <Movie> movieByGenre(@PathVariable String genre) {
		
		return service.movieByGenre(genre);
	}
	 @GetMapping("/movies/name/{name}")
	public List<Movie> movieByName(@PathVariable String name){
		
		return service.movieByName(name);
	}
	@GetMapping("movies/all")
	public List<Movie> allMovies(){
		return service.findAll();
	}
	@GetMapping("/and/{name}/{budget}")
	public List<Movie> getByNameAndBudget(@PathVariable String name,@PathVariable long budget){
		return service.getByNameAndBudget(name,budget);
	}
	@GetMapping("/or/{name}/{budget}")
	public List<Movie> getbyNameOrBudget(@PathVariable String name,@PathVariable long budget){
		return service.getbyNameOrBudget(name,budget);
	}
	   @GetMapping("movies/review/{review}")
	public List<Movie> getByReview(@PathVariable double review){
		return service.getByReview(review);
	}
	   @GetMapping("/movies/sort")
	public List<Movie> sortBy(){
		return service.sortBy();
	} 
	   @Transactional
	   @DeleteMapping("/delete/{name}")
	   public String deleteMovieByName(@PathVariable String name) {
		  return service.deleteMovieByName(name);
		 
	}@PutMapping("/movies/update/{name}")
	public Movie updateMovieByName(@RequestBody Movie movie, @PathVariable String name) {
	    return service.updateMovieByName(movie, name);
	}

	

}
