package org.sid.orderservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long production;
    private double price;
    private int quantity;
    private double discount;
    @ManyToOne
    private Order order;

    public double getAmount(){
        return price*quantity*(1-discount);
    }
}
