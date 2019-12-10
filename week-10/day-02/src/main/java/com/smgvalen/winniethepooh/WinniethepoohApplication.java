package com.smgvalen.winniethepooh;

import com.smgvalen.winniethepooh.models.House;
import com.smgvalen.winniethepooh.models.Inhabitant;
import com.smgvalen.winniethepooh.repositories.HouseRepository;
import com.smgvalen.winniethepooh.repositories.InhabitantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WinniethepoohApplication implements CommandLineRunner {

  HouseRepository houseRepository;
  InhabitantRepository inhabitantRepository;

  @Autowired
  public WinniethepoohApplication(
      HouseRepository houseRepository,
      InhabitantRepository inhabitantRepository) {
    this.houseRepository = houseRepository;
    this.inhabitantRepository = inhabitantRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(WinniethepoohApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Inhabitant i1 = new Inhabitant("Malac", 3, "female");
    Inhabitant i2 = new Inhabitant("Tigris", 5, "male");
    Inhabitant i3 = new Inhabitant("Nyuszi", 6, "female");

    House h1 = new House("white", 4, "disznóól");
    House h2 = new House("brown", 3, "faodú");
    House h3 = new House("white", 6, "üreg");
    House h4 = new House("white", 7, "mező");
    House h5 = new House("green", 4, "fakorona");
    House h6 = new House("green", 2, "vadászles");
    House h7 = new House("brown", 1, "bokor");
    House h8 = new House("brown", 5, "veteményeskert");

   i1.addHouse(h1);
   i1.addHouse(h7);

   i2.addHouse(h4);
   i2.addHouse(h5);
   i2.addHouse(h6);

   i3.addHouse(h2);
   i3.addHouse(h8);
   i3.addHouse(h3);

    inhabitantRepository.save(i1);
    inhabitantRepository.save(i2);
    inhabitantRepository.save(i3);

    // Extend the Main page with a field that displays:
    // "There are [number] rooms present that belong to white houses"
  }
}
