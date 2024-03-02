package com.example.cinema_api.domain;

import kotlinx.serialization.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Serializable
public class SessionDateTime {
    private String dateTimeString;

    public SessionDateTime(String dateTimeString) {
        this.dateTimeString = dateTimeString;
    }

    public boolean isAfter(SessionDateTime value) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        LocalDateTime otherDateTime = LocalDateTime.parse(value.dateTimeString, formatter);
        return dateTime.isAfter(otherDateTime);
    }

    public boolean isAfter(LocalDateTime value) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        return dateTime.isAfter(value);
    }

    public boolean isBefore(SessionDateTime value) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        LocalDateTime otherDateTime = LocalDateTime.parse(value.dateTimeString, formatter);
        return dateTime.isBefore(otherDateTime);
    }

    public boolean isBefore(LocalDateTime value) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        return dateTime.isBefore(value);
    }

    @Override
    public String toString() {
        return dateTimeString;
    }
}