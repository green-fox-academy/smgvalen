package com.smgvalen.helloworld.services;

import java.util.List;

public interface StudentServiceProvider {

  List<String> findAll();
  int count();
  void save(String student);
  boolean contains(String student);
}
