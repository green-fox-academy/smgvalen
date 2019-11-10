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
   /* Assignee csoszi = new Assignee("Csoszi", "csoszi@conquerer.com");
    repo.save(csoszi);
    repo.save(new Assignee("Irene", "me@myself.com"));
    repo.save(new Assignee("Lois Einhorn", "iamrayfinkle@psst.com"));
    repository.save(new Todo("Start the day", false, true));
    repository.save(new Todo("Do your job", true, true));
    repository.save(new Todo("Run away from bundesliga-styled haircuts", true, false));
    repository.save(new Todo("Livin' in the 90's", false, false));


    Todo wakeUp = new Todo ("wake up", true, true);

    csoszi.addTodo(wakeUp);
    repo.save(csoszi); */

  }
}
