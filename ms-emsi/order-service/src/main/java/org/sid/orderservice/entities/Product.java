package org.sid.orderservice.entities;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private Long name;
    private double price;
    private int quantity;

}
