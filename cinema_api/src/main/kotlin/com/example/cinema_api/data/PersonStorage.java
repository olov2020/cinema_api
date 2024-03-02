package com.example.cinema_api.data;

import domain.Person;
import domain.Role;
import validation.model.Result;

public interface PersonStorage {
    void save(Person person);

    Result get(String login, String password, Role role);
}