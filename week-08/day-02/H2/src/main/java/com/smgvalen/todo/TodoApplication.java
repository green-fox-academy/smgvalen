package com.smgvalen.todo;

import com.smgvalen.todo.models.Todo;
import com.smgvalen.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  private TodoRepository repository;

  @Autowired
  public TodoApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("Start the Day", true, true));
    repository.save(new Todo("Finish H2 worksop1", true, false));
    repository.save(new Todo("Finish JPA worksop2", true, true));
    repository.save(new Todo("Create a CRUD project", true, true));
  }
}
