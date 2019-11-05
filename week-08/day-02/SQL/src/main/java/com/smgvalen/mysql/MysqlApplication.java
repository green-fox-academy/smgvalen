package com.smgvalen.mysql;

import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

  TodoRepository repository;

  @Autowired
  public MysqlApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
   /* repository.save(new Todo("Start the Day", false, true));
    repository.save(new Todo("Finish H2 worksop1", true, true));
    repository.save(new Todo("Finish JPA worksop2", true, false));
    repository.save(new Todo("Create a CRUD project", false, false)); */
  }
}
