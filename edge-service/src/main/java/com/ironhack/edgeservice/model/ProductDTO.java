package com.ironhack.edgeservice.model;

public class ProductDTO {
    private Long serialNumber;
    private int quantity;
    private String productName;
    private double price;

    public ProductDTO(Long serialNumber, int quantity, String productName, double price) {
        this.serialNumber = serialNumber;
        this.quantity = quantity;
        this.productName = productName;
        this.price = price;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
