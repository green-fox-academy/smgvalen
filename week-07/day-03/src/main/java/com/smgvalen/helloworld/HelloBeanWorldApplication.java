package com.smgvalen.helloworld;

import com.smgvalen.helloworld.services.MyColor;
import com.smgvalen.helloworld.services.Print;
import com.smgvalen.helloworld.services.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

  private Print print;
  private MyColor color;

  @Autowired
  public HelloBeanWorldApplication(Print print, @Qualifier("red")MyColor color) {
    this.print = print;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloBeanWorldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    print.log("no clue what to do");
    color.printColor();
  }
}
