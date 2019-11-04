package com.green.fox.club.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private int tricks;
  private String food;
  private String drink;

  public Fox(String name, int tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public Fox() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTricks() {
    return tricks;
  }

  public void setTricks(int tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
