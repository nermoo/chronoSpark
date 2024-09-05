package com.nermo.movie.service.service;

import com.nermo.movie.service.dto.ReviewRequest;
import com.nermo.movie.service.model.Review;
import com.nermo.movie.service.repository.MovieRepository;
import com.nermo.movie.service.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;


    public void addReview(ReviewRequest reviewRequest){
        Review review = Review.builder()
                        .movieId(reviewRequest.getMovieId())
                        .review(reviewRequest.getReview())
                        .review(reviewRequest.getUserId()).build();
        reviewRepository.save(review);
    }
}
