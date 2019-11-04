package com.green.fox.club.services;

import com.green.fox.club.models.Fox;
import com.green.fox.club.repositories.ClubRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {

  private ClubRepository repository;

  @Autowired
  public ClubService(ClubRepository repository) {
    this.repository = repository;
  }

  public List<Fox> getFoxes(){
    return repository.getFoxes();
  }

  public List<Fox> getFoxByName(String name) {
    return repository.getFoxes().stream()
        .filter(f -> f.getName().
            toLowerCase().equals(name))
        .collect(Collectors.toList());

  }
}
