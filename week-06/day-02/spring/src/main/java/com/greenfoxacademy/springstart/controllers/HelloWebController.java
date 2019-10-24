package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  AtomicLong counter = new AtomicLong();

  @RequestMapping(value="/web/greeting")  // http://localhost:8080/web/greeting
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }


  @RequestMapping(value="/web")  // http://localhost:8080/web/?name=valen
  public String countAndGreetByName (Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());

    return "greetingCounterByName";
  }
}
