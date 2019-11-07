package com.smgvalen.mysql.repositories;

import com.smgvalen.mysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
}
