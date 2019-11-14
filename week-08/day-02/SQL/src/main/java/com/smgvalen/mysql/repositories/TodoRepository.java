package com.smgvalen.mysql.repositories;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(boolean done);

  List<Todo> findByAssignee(Assignee assignee);

List<Todo> findAllByTitleIsContaining(String title);

//  List<Todo> findAllByAssigneeNameContaining(String name);
 // List<Todo> findAllByCreationDateContaining(String cDate);
 // List<Todo> findAllByDueDateContaining(String dDate);
}
