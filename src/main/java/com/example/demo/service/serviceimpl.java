package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Movie;
import com.example.demo.Repository.MovieRepository;

@Service
public class serviceimpl implements serviceinterface {
	
@Autowired	
private MovieRepository movierepository;

@Override
public Movie insertMovie(Movie movie) {
	
	return movierepository.save(movie);
}

@Override
public List<Movie> movieByGenre(String genre) {
	
	return movierepository.findByGenre(genre);
}

@Override
public List<Movie> movieByName(String name) {
	return movierepository.findByName(name);
}


@Override
public List<Movie> findAll() {
	return (List<Movie>) movierepository.findAll();
}

@Override
public List<Movie> getByNameAndBudget(String name, long budget) {
	return movierepository.findByNameAndBudget(name,budget);
}

@Override
public List<Movie> getByReview(double review) {
	return movierepository.findByReview(review);
}

@Override
public List<Movie> getbyNameOrBudget(String name, long budget) {
	return movierepository.findByNameOrBudget(name, budget);
}

@Override
public List<Movie> sortBy() {
	return movierepository.findAll(Sort.by("name").ascending());
}

@Override
public String deleteMovieByName(String name) {
	 movierepository.deleteByName(name);
	 return "deleted successfully";
}

@Override
public Movie updateMovieByName(Movie movie, String name) {
 
    List<Movie> existingMovies = movierepository.findByName(name);


    if (existingMovies != null && !existingMovies.isEmpty()) {
  
        Movie existingMovie = existingMovies.get(0);

       
        existingMovie.setGenere(movie.getGenere());
        existingMovie.setReview(movie.getReview());
        existingMovie.setBudget(movie.getBudget());
        existingMovie.setTicket_price(movie.getTicket_price());
        
      

      
        return movierepository.save(existingMovie);
    } else {
      
        throw new RuntimeException("Movie not found with name: " + name);
    }
}




}





