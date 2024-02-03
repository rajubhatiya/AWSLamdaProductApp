package com.agarment.product.productservice.entity;


import java.util.Objects;

public class Product {

  //  @Id
   // @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private long productId;

    //@Column(name = "PRODUCT_NAME")
    private String productName;

    //@Column(name = "PRICE")
    private long price;

    //@Column(name = "QUANTITY")
    private long quantity;

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product product)) return false;
      return getProductId() == product.getProductId() && getPrice() == product.getPrice() && getQuantity() == product.getQuantity() && Objects.equals(getProductName(), product.getProductName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getProductId(), getProductName(), getPrice(), getQuantity());
  }

  @Override
  public String toString() {
    return "Product{" +
            "productId=" + productId +
            ", productName='" + productName + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            '}';
  }
}