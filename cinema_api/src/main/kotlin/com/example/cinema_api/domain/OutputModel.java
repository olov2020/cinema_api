package com.example.cinema_api.domain;

public final class OutputModel {
    private final String message;

    public OutputModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "OutputModel{" +
                "message='" + message + '\'' +
                '}';
    }
}