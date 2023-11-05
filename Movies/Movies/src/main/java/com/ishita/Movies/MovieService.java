package com.ishita.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //will let the framework know that we want it to instantiate this class MovieRepository for us
    public MovieRepository movieRepository;
    public List<Movie> allMovies(){

        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieByImdbId(String imdbId){ //by using optional we are letting java know that it can return null too
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
