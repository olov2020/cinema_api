package com.example.cinema_api.validation.impl;

import com.example.cinema_api.domain.SessionDateTime;
import com.example.cinema_api.validation.Validator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidatorImpl implements Validator {
    private Scanner scanner;

    public ValidatorImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int validateInt(String command) {
        while (true) {
            System.out.println(command);
            String value = scanner.nextLine();
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }

    @Override
    public long validateLong(String command) {
        while (true) {
            System.out.println(command);
            String value = scanner.nextLine();
            try {
                return Long.parseLong(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }

    @Override
    public SessionDateTime validateTime(String command) {
        while (true) {
            System.out.println(command);
            String value = scanner.nextLine();
            try {
                LocalDateTime dateTime = LocalDateTime.parse(value, DateTimeFormatter.ofPattern("yyyy MM dd HH:mm"));
                if (dateTime.isBefore(LocalDateTime.now())) {
                    throw new Exception();
                }
                return new SessionDateTime(value);
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }

    @Override
    public String validateString(String command) {
        while (true) {
            System.out.println(command);
            String value = scanner.nextLine();
            if (value.isBlank()) {
                System.out.println("String cannot be empty");
            } else {
                return value;
            }
        }
    }
}