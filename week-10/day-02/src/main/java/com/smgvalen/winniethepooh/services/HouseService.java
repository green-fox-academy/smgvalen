package com.smgvalen.winniethepooh.services;

import com.smgvalen.winniethepooh.models.House;
import java.util.List;

public interface HouseService {

  void save (House house);

  List<House> listHouses ();

  House findById(Long id);
}
