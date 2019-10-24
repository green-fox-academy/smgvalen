package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.controllers.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {

//    Greeting greets = new Greeting(atomicLong.getAndIncrement()+1, name);
    Greeting greets = new Greeting(atomicLong.addAndGet(1), name);


    return greets;
  }
}
