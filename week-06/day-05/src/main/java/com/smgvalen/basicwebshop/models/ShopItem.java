package com.smgvalen.basicwebshop.models;

public class ShopItem {

  private String name;
  private String description;
  private Double price;
  private Integer quantityOfStock;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(Integer quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }

  public ShopItem(String name, String description, Double price, Integer quantityOfStock){
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }
}
