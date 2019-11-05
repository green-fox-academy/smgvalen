package com.smgvalen.todo.services;

import com.smgvalen.todo.models.Todo;
import com.smgvalen.todo.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImp implements ITodoService {

  private TodoRepository repository;

  @Autowired
  public TodoServiceImp(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    repository.findAll().forEach(todoList::add);
    return todoList;
  }

  @Override
  public void save(Todo todo) {
    repository.save(todo);
  }

  @Override
  public void delete(long id) {
    repository.deleteById(id);
  }

  @Override
  public Todo findById(long id) {
    return repository.findById(id).orElse(null);
  }
}
