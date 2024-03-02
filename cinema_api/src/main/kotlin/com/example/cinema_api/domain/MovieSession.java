package com.example.cinema_api.domain;
import java.time.LocalDateTime;
import com.example.cinema_api.domain.CinemaHall;

public class MovieSession {
    private long id;
    private Movie movie;
    private CinemaHall cinemaHall;
    private SessionDateTime sessionBegin;
    private SessionDateTime sessionEnd;
    private boolean isMutable;

    public String toString() {
        return "Номер сеанса: " + id + "\n" + movie + "\nЗрительный зал:\n" + cinemaHall + "\nНачало сеанса: " + sessionBegin + "\nКонец сеанса: " + sessionEnd;
    }
}