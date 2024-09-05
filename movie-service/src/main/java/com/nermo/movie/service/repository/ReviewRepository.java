package com.nermo.movie.service.repository;

import com.nermo.movie.service.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review,String> {
}
