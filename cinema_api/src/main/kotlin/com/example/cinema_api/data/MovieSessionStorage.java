package com.example.cinema_api.data;

import com.example.cinema_api.domain.MovieSession;
import com.example.cinema_api.validation.model.Result;

import java.util.List;

public interface MovieSessionStorage {
    void save(MovieSession movieSession);

    Result get(long id);

    List<MovieSession> getAll();

    Result update(MovieSession movieSession);
}