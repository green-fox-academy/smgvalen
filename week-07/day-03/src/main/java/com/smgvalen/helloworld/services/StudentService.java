package com.smgvalen.helloworld.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceProvider {

  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    names.add(student);
  }

  @Override
  public int count() {
    return names.size();
  }

  @Override
  public boolean contains(String student) {
    return names.contains(student);
  }
}

