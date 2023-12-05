package org.sid.orderservice.service;

import org.sid.orderservice.entities.Product;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface InventoryRestClientService {

    @GetMapping
    public Product productById(@PathVariable Long id);
    @GetMapping
    public PagedModel<Product> allProducts();

}
