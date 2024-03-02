package com.example.cinema_api.domain;
import java.util.ArrayList;
import java.util.List;

public class CinemaHall {
    private List<SeatStatus> seatList = new ArrayList<>();

    public CinemaHall() {
        for (int i = 0; i < 100; i++) {
            seatList.add(SeatStatus.FREE);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(seatList.get(i) == SeatStatus.FREE ? i + 1 : "X");
            stringBuilder.append((i + 1) % 10 == 0 ? "\n" : " ");
        }
        return stringBuilder.toString();
    }
}