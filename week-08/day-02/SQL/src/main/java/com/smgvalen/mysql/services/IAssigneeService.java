package com.smgvalen.mysql.services;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.models.Todo;
import java.util.List;

public interface IAssigneeService {

  List<Assignee> findAll();

  void save(Assignee assignee);

  void delete(long id);
}
