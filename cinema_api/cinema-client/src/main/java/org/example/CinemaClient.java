package org.example;

import org.example.dto.Cinema;
import org.example.dto.CinemaList;
import org.example.dto.Hall;
import org.example.dto.HallList;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "product-storage", url = "${product.storage.url}")
public interface CinemaClient extends CinemaApi {

    @GetMapping("/api/v1/product")
    ProductList findProducts(
            @RequestParam(required = false, name = "name", defaultValue = "") String name,
            @RequestParam(required = false, name = "id") List<UUID> ids);

    @GetMapping("/api/v1/product/{id}")
    DetailedProduct getProductById(@PathVariable(name = "id") UUID id);

    @PostMapping("/api/v1/product")
    Product createProduct(@RequestBody DetailedProduct detailedProduct);

    @PutMapping("/api/v1/product/{id}")
    void editProduct(@PathVariable(name = "id") UUID id, @RequestBody DetailedProduct detailedProduct);

    @DeleteMapping("/api/v1/product/{id}")
    void deleteProduct(@PathVariable(name = "id") UUID id);
}
