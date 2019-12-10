package com.smgvalen.helloworld.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentFileService implements StudentServiceProvider{

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  //nem tárol listát, file-ba ment ki

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

}
