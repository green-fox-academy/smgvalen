package com.greenfoxacademy.springstart.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  Random random = new Random();
  AtomicLong counter = new AtomicLong();
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};

  @RequestMapping(value = "/web/greeting")  // http://localhost:8080/web/greeting
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }

  @RequestMapping(value = "/webcounter")  // http://localhost:8080/web/?name=valen
  public String countAndGreetByName(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());

    return "greetingCounterByName";
  }

  @GetMapping(value = "web/sayHelloToAll")
  // http://localhost:8080/web/sayHelloToAll?color=red&fontSize=74
  public String sayGreetingAllLanguages(Model model,
      @RequestParam(defaultValue = "black") String color,
      @RequestParam(defaultValue = "24") String fontSize) {

    model.addAttribute("color", color);
    model.addAttribute("fontSize", Integer.parseInt(fontSize));
    model.addAttribute("text", hellos[random.nextInt(hellos.length)]);

    return "sayHelloToAll";
  }
}
