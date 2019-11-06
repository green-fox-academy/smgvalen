package com.smgvalen.mysql.services;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.repositories.AssigneeRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImp implements IAssigneeService {

  private AssigneeRepo repo;

  @Autowired
  public AssigneeServiceImp(AssigneeRepo repo) {
    this.repo = repo;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    repo.findAll().forEach(assigneeList::add);
    return assigneeList;
  }

  @Override
  public void save(Assignee assignee) {
    repo.save(assignee);
  }

  @Override
  public void delete(long id) {
    repo.deleteById(id);
  }
}
