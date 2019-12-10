package com.smgvalen.mysql.services;


import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.models.Todo;
import java.util.List;

public interface ITodoService {

  List<Todo> findAll();

  void save(Todo todo);

  void delete(long id);

  Todo findById(long id);

  List<Todo> findByAssignee(Assignee assignee);

 public List<Todo> search(String searchByFiltering, String searched);


 List<Todo> findTodoByString(String title);

  List<Todo> findAllByDone(boolean done);
}
