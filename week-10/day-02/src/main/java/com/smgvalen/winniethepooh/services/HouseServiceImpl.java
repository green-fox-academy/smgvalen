package com.smgvalen.winniethepooh.services;

import com.smgvalen.winniethepooh.models.House;
import com.smgvalen.winniethepooh.repositories.HouseRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {

  private HouseRepository houseRepository;

  @Autowired
  public HouseServiceImpl(HouseRepository houseRepository) {
    this.houseRepository = houseRepository;
  }

  @Override
  public void save(House house) {
    houseRepository.save(house);
  }

  @Override
  public List<House> listHouses() {
    List<House> houseList = new ArrayList<>();
    houseRepository.findAll().forEach(houseList::add);
    return houseList;
  }

  @Override
  public House findById(Long id) {
    return houseRepository.findById(id).orElse(null);
  }
}
