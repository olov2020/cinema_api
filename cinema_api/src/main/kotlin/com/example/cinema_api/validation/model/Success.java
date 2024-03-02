package com.example.cinema_api.validation.model;

public class Success<T> extends Result {
    private T body;

    public Success(T body) {
        this.body = body;
    }

    public T getBody() {
        return body;
    }
}