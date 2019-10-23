package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.controllers.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting() {
    Greeting greets = new Greeting(1, "Hello, World!");
    return greets;
  }
}
