package com.smgvalen.winniethepooh.services;

import com.smgvalen.winniethepooh.models.Inhabitant;
import java.util.List;

public interface InhabitantService {

  List<Inhabitant> listInhabitants();

  void save(Inhabitant inhabitant);

  Inhabitant findById(Long id);

  Inhabitant findByName(String name);

  Integer countRooms(String color);

}
