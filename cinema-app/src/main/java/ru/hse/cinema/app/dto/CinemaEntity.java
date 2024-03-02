package ru.hse.cinema.app.dto;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CinemaEntity {
    private UUID id;
    private List<HallEntity> halls;
}
