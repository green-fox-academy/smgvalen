package com.smgvalen.helloworld;

import com.smgvalen.helloworld.services.Print;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

  private Print print;

  @Autowired
  public HelloBeanWorldApplication(Print print) {
    this.print = print;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloBeanWorldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    print.log("no clue what to do");
  }
}
