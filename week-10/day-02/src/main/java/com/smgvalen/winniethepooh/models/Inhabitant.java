package com.smgvalen.winniethepooh.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Inhabitant {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Integer age;
  private String gender;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "inhabitant", fetch = FetchType.LAZY)
  private List<House> houses = new ArrayList<>();

  public Inhabitant(String name, Integer age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }


  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public List<House> getHouses() {
    return houses;
  }

  public void addHouse(House house){
    houses.add(house);
    house.setInhabitant(this);
  }
}
