package com.smgvalen.winniethepooh.services;

import com.smgvalen.winniethepooh.models.Inhabitant;
import com.smgvalen.winniethepooh.repositories.HouseRepository;
import com.smgvalen.winniethepooh.repositories.InhabitantRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InhabitantServiceImpl implements InhabitantService {

  private InhabitantRepository inhabitantRepository;
  private HouseRepository houseRepository;

  @Autowired
  public InhabitantServiceImpl(InhabitantRepository inhabitantRepository,
      HouseRepository houseRepository) {
    this.inhabitantRepository = inhabitantRepository;
    this.houseRepository = houseRepository;
  }

  @Override
  public List<Inhabitant> listInhabitants() {
    List<Inhabitant> list = new ArrayList<>();
    inhabitantRepository.findAll().forEach(list::add);
    return list;
  }

  @Override
  public void save(Inhabitant inhabitant) {
    inhabitantRepository.save(inhabitant);
  }

  @Override
  public Inhabitant findById(Long id) {
    return inhabitantRepository.findById(id).orElse(null);
  }

  @Override
  public Inhabitant findByName(String name) {
    return inhabitantRepository.findByName(name);
  }

  @Override
  public Integer countRooms(String color) {
    return houseRepository.countRoomsByColor(color);
  }
}
