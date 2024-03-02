package com.example.cinema_api.data;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class Storage {
    private String path;

    public Storage(String path) {
        this.path = path;
    }
}
