package com.smgvalen.mysql;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.repositories.AssigneeRepo;
import com.smgvalen.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

  TodoRepository repository;
  AssigneeRepo repo;

  @Autowired
  public MysqlApplication(TodoRepository repository, AssigneeRepo repo) {
    this.repository = repository;
    this.repo = repo;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    /*repo.save(new Assignee("Csoszi", "csoszi@conquerer.com"));
    repo.save(new Assignee("Irene", "me@myself.com"));
    repo.save(new Assignee("Lois Einhorn", "iamrayfinkle@psst.com"));
    repository.save(new Todo("Start the Day", false, true));
    repository.save(new Todo("Finish H2 worksop1", true, true));
    repository.save(new Todo("Finish JPA worksop2", true, false));
    repository.save(new Todo("Create a CRUD project", false, false)); */
  }
}
