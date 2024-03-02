package com.example.cinema_api.domain;

import kotlinx.serialization.Serializable;

@Serializable
public enum SeatStatus {
    FREE,
    SOLD
}