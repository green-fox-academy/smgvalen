package com.smgvalen.mysql.services;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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
    return todoList; //.stream()
    //    .sorted(Comparator.comparing(t -> t.getId())).collect(Collectors.toList());
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

  @Override
  public List<Todo> findTodoByString(String searched) {
    return repository.findAllByTitleIsContaining(searched);
  }

  @Override
  public List<Todo> findByAssignee(Assignee assignee) {
    return repository.findByAssignee(assignee);
  }

  @Override
  public List<Todo> findAllByDone(boolean done) {
    return repository.findAllByDone(done);
  }



  /* @Override
  public List<Todo> searchBySomething(String something, String searched) {
    if (something.equals("title")) {
      return repository.findAllByTitleIsContaining(searched);
    } else if (something.equals("creation")) {
      return repository.findAllByCreationDateContaining(searched);
    } else if (something.equals("due")) {
      return repository.findAllByDueDateContaining(searched);
    } else if (something.equals("name")) {
      return repository.findAllByAssigneeNameContaining(searched);
    } else {
      return null;
    }
  } */
}


