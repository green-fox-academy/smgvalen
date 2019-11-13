package com.smgvalen.frontend.services;

import com.smgvalen.frontend.models.Log;
import com.smgvalen.frontend.repositories.LogRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService implements LogServiceInterface{

  private LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public List<Log> findAll() {
    List<Log> logList = new ArrayList<>();
    logRepository.findAll().forEach(logList::add);
    return logList;
  }

  @Override
  public void save(Log log) {
  logRepository.save(log);
  }

  @Override
  public Log findById(Long id) {
    return logRepository.findById(id).orElse(null);
  }
}
