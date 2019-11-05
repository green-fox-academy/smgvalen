package com.smgvalen.todo.services;

import com.smgvalen.todo.models.Todo;
import java.util.List;

public interface ITodoService {

  List<Todo> findAll();
  void save(Todo todo);
  void delete(long id);
  Todo findById(long id);
}
