package com.smgvalen.frontend.services;

import com.smgvalen.frontend.models.Log;
import java.util.List;

public interface LogServiceInterface {

  List<Log> findAll();
  void save(Log log);
  Log findById(Long id);
}
