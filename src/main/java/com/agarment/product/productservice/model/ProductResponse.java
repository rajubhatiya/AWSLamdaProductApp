package com.agarment.product.productservice.model;

import java.util.Objects;

public class ProductResponse {

    private String productName;
    private long productId;
    private long quantity;
    private long price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductResponse that)) return false;
        return getProductId() == that.getProductId() && getQuantity() == that.getQuantity() && getPrice() == that.getPrice() && Objects.equals(getProductName(), that.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getProductId(), getQuantity(), getPrice());
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}