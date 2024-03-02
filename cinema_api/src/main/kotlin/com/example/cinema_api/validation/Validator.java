package com.example.cinema_api.validation;

import com.example.cinema_api.domain.SessionDateTime;
import com.example.cinema_api.validation.model.Result;
import java.time.LocalDateTime;

public interface Validator {
    int validateInt(String command);
    long validateLong(String command);
    SessionDateTime validateTime(String command);
    String validateString(String command);
}
