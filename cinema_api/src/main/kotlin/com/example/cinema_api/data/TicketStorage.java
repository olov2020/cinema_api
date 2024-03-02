package com.example.cinema_api.data;

import com.example.cinema_api.domain.Ticket;
import com.example.cinema_api.validation.model.Result;
import java.util.List;

public interface TicketStorage {
    void save(Ticket ticket);

    Result get(long id);

    List<Ticket> getAll();

    Result delete(long id);
}