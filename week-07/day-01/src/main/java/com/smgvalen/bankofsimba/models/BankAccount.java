package com.smgvalen.bankofsimba.models;

public class BankAccount {

  private String name;
  private Integer balance;
  private String animalType;
  private boolean King;
  private boolean goodGuy;

  public BankAccount(String name, Integer balance, String animalType, boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.King = false;
    this.goodGuy = goodGuy;
  }

  public BankAccount(String name, Integer balance, String animalType, boolean goodGuy, boolean King) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.goodGuy = goodGuy;
    this.King = King;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return King;
  }

  public void setKing(boolean king) {
    King = king;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    this.goodGuy = goodGuy;
  }
}
