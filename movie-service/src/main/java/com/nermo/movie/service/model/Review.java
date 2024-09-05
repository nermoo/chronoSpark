package com.nermo.movie.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "review")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Review {
    private String movieId;
    private String review;
    private String userId;
    @CreatedDate
    private Date created_at;
    @LastModifiedDate
    private Date updated_at;
}
