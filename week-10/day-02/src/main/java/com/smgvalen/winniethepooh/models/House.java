package com.smgvalen.winniethepooh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class House {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String color;
  private Integer numberOfRooms;
  private String name;
  @ManyToOne()
  private Inhabitant inhabitant;

  public House(String color, Integer numberOfRooms, String name) {
    this.color = color;
    this.numberOfRooms = numberOfRooms;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setInhabitant(Inhabitant inhabitant) {
    this.inhabitant = inhabitant;
  }

  public Inhabitant getInhabitant() {
    return inhabitant;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Integer getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
