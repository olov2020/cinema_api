package com.example.cinema_api.domain;

import kotlinx.serialization.Serializable;

@Serializable
public class Ticket {
    private long id;
    private long clientId;
    private int seatNumber;
    private MovieSession session;

    public Ticket(long id, long clientId, int seatNumber, MovieSession session) {
        this.id = id;
        this.clientId = clientId;
        this.seatNumber = seatNumber;
        this.session = session;
    }

    @Override
    public String toString() {
        return "Номер билета: " + id + "\nНомер пользователя: " + clientId + "\nНомер места: " + seatNumber + "\n" + session + ")";
    }
}