package com.example.cinema_api.data;

import com.example.cinema_api.domain.Movie;
import com.example.cinema_api.validation.model.Result;

import java.util.List;

public interface MovieStorage {
    void save(Movie movie);

    Result get(long id);

    List<Movie> getAll();

    Result update(Movie movie);
}