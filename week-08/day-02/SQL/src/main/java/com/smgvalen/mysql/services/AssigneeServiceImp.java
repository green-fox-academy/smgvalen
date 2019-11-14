package com.smgvalen.mysql.services;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.repositories.AssigneeRepo;
import com.smgvalen.mysql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImp implements IAssigneeService {

  private AssigneeRepo assigneeRepo;
  private TodoRepository todoRepository;

  @Autowired
  public AssigneeServiceImp(AssigneeRepo assigneeRepo, TodoRepository todoRepository) {
    this.assigneeRepo = assigneeRepo;
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    assigneeRepo.findAll().forEach(assigneeList::add);
    return assigneeList;
  }

  @Override
  public void save(Assignee assignee) {
    assigneeRepo.save(assignee);
  }

  @Override
  public void delete(Assignee assignee) {
    for (Todo todo : todoRepository.findByAssignee(assignee)) {
      if (todo.getAssignee() == assignee) {
        todo.setAssignee(null);
      }
    } assigneeRepo.delete(assignee);
  }

  @Override
  public Assignee findById(long id) {
    return assigneeRepo.findById(id).orElse(null);
  }
}
