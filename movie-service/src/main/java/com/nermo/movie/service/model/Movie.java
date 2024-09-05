package com.nermo.movie.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value="movie")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Movie {
    @Id
    private String id;
    private String name;
    private String description;
    private Date released_year;
}
