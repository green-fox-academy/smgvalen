package com.smgvalen.sample.services;

import com.smgvalen.sample.models.Object;
import java.util.List;

public interface ObjectService {

  void save(Object object);

  void delete(Long id);

  List<Object> getObjects();

  Object findObjectById(Long id);
}
