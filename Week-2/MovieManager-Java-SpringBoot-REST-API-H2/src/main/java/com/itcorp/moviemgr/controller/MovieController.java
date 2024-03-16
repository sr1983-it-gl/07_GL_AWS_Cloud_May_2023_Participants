package com.itcorp.moviemgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itcorp.moviemgr.error.ErrorUtils;
import com.itcorp.moviemgr.model.Movie;
import com.itcorp.moviemgr.repository.MovieRepository;

@RestController
public class MovieController {

	@Autowired
	MovieRepository repository;
	
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        
        return "Movie Manager Application stores and organizes movies for easy access";
    }

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getAllMovies() {
		
		return repository.findAll();
	}

	@RequestMapping(value = "/movies/{movieId}", method = RequestMethod.GET)
	public Movie getMovie(@PathVariable("movieId") int movieId) {
		
		return repository.findById(movieId).get();
	}
	
	
	@PostMapping(value = "/movies")
	public int addMovie(@RequestBody Movie movie) {

		ErrorUtils.checkForInvalidRating(movie);
		ErrorUtils.checkForInvalidGenre(movie);
		
		repository.save(movie);
		return movie.getId();
	}

	@PutMapping(value = "/movies/{movieId}")
	public int updateMovie(@RequestBody Movie movie, @PathVariable("movieId") int movieId) {

		Movie  existingMovieObj 
			= repository.findById(movieId).get();
		
		existingMovieObj.setName(movie.getName());
		existingMovieObj.setYearOfRelease(movie.getYearOfRelease());
		existingMovieObj.setRating(movie.getRating());
		existingMovieObj.setGenres(movie.getGenres());
		
		repository.save(existingMovieObj);
		return existingMovieObj.getId();
	}	


	@DeleteMapping(value = "/movies/{movieId}")
	public void deleteMovie(@PathVariable("movieId") int movieId) {

		repository.deleteById(movieId);		
	}	
	
}
