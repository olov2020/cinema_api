package org.example.cinema.client;

import org.example.cinema.api.CinemaApi;
import org.example.cinema.api.dto.Cinema;
import org.example.cinema.api.dto.CinemaList;
import org.example.cinema.api.dto.Hall;
import org.example.cinema.api.dto.HallList;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "cinema", url = "${cinema.url}")
public interface CinemaClient extends CinemaApi {

    @GetMapping("/api/v1/cinema")
    ProductList findProducts(
            @RequestParam(required = false, name = "name", defaultValue = "") String name,
            @RequestParam(required = false, name = "id") List<UUID> ids);

    @GetMapping("/api/v1/cinema/{id}")
    DetailedProduct getProductById(@PathVariable(name = "id") UUID id);

    @PostMapping("/api/v1/cinema")
    Cinema createProduct(@RequestBody DetailedProduct detailedProduct);

    @PutMapping("/api/v1/cinema/{id}")
    void editProduct(@PathVariable(name = "id") UUID id, @RequestBody DetailedProduct detailedProduct);

    @DeleteMapping("/api/v1/cinema/{id}")
    void deleteProduct(@PathVariable(name = "id") UUID id);
}
