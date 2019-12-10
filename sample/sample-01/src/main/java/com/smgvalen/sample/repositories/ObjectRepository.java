package com.smgvalen.sample.repositories;

import com.smgvalen.sample.models.Object;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends CrudRepository<Object, Long> {

  List<Object> findAll();

  Object findObjectById(Long id);
}
