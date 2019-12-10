package com.smgvalen.sample.services;

import com.smgvalen.sample.models.Object;
import com.smgvalen.sample.repositories.ObjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjectServiceImpl implements ObjectService {

  private ObjectRepository objectRepository;

  @Autowired
  public ObjectServiceImpl(ObjectRepository objectRepository) {
    this.objectRepository = objectRepository;
  }

  @Override
  public void save(Object object) {
    objectRepository.save(object);
  }

  @Override
  public Object findObjectById(Long id){
    return objectRepository.findObjectById(id);
  }

  @Override
  public void delete(Long id) {
    objectRepository.delete(findObjectById(id));
  }

  @Override
  public List<Object> getObjects() {
    return objectRepository.findAll();
  }
}
