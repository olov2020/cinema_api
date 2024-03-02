package com.example.cinema_api.domain;

import com.google.gson.Gson;

public class Movie {
    private long id;
    private String name;
    private String genre;
    private String director;
    private boolean isMutable;

    public Movie(long id, String name, String genre, String director, boolean isMutable) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.isMutable = isMutable;
    }

    @Override
    public String toString() {
        return "Номер фильма: " + id + "\nНазвание: " + name + "\nЖанр: " + genre + "\nРежиссер: " + director;
    }


}