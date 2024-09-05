package com.nermo.movie.service.repository;

import com.nermo.movie.service.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
