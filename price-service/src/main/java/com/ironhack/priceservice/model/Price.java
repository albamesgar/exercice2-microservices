package com.ironhack.priceservice.model;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "price_table")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serialNumber;
    private String productName;
    private double price;

    public Price() {
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
