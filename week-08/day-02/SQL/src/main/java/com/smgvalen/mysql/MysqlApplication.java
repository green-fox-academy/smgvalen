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

  TodoRepository todoRepository;
  AssigneeRepo assigneeRepo;

  @Autowired
  public MysqlApplication(TodoRepository todoRepository, AssigneeRepo assigneeRepo) {
    this.todoRepository = todoRepository;
    this.assigneeRepo = assigneeRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  /*  assigneeRepo.save(new Assignee("Irene", "me@myself.com"));
    assigneeRepo.save(new Assignee("Lois Einhorn", "iamrayfinkle@psst.com"));
    todoRepository.save(new Todo("Start the day", false, true));
    todoRepository.save(new Todo("Do your job", true, true));
    todoRepository.save(new Todo("Run away from bundesliga-styled haircuts", true, false));
    todoRepository.save(new Todo("Livin' in the 90's", false, false));

    Assignee csoszi = new Assignee("Csoszi", "csoszi@conquerer.com");
    Todo wakeUp = new Todo("wake up", true, true);
    csoszi.addTodo(wakeUp);
    assigneeRepo.save(csoszi);
    todoRepository.save(wakeUp);

    Assignee mandalorian = new Assignee("Mando", "pablop@gmail.com");
    Todo todo = new Todo("regular bountyhunting", true, false);
    mandalorian.addTodo(todo);
    assigneeRepo.save(mandalorian);
    todoRepository.save(todo); */
  }
}
