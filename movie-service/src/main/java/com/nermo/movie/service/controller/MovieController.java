package com.nermo.movie.service.controller;

import com.nermo.movie.service.dto.BookmarkRequest;
import com.nermo.movie.service.dto.ReviewRequest;
import com.nermo.movie.service.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;
    @PostMapping("/bookmark")
    public void bookmarkMovie(BookmarkRequest bookmarkRequest){

    }

    @PostMapping("/review")
    public void addReview(@RequestBody ReviewRequest reviewRequest){
        movieService.addReview(reviewRequest);
    }
}
