package com.example.cinema_api.validation.model;

public abstract class Result {
    public Result() {}

    public static final class Success extends Result {
        public String message;

        public Success(String message) {
            this.message = message;
        }
    }

    public static final class Error extends Result {
        public String errorMessage;

        public Error(String errorMessage) {
            this.errorMessage = errorMessage;
        }
    }
}
