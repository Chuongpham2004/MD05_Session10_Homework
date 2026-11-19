package org.example.md05_session10_homework.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String item;

    private BigDecimal totalPrice;

    private Instant createdAt = Instant.now();

    protected Order() {
    }

    public Order(String customerName, String item, BigDecimal totalPrice) {
        this.customerName = customerName;
        this.item = item;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getItem() {
        return item;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
