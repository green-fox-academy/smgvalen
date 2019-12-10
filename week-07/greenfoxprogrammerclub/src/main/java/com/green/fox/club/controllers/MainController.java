package com.green.fox.club.controllers;

import com.green.fox.club.models.Fox;
import com.green.fox.club.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private ClubService service;

  @Autowired
  public MainController(ClubService service) {
    this.service = service;
  }

  @GetMapping(value = "/")
  public String route(Model model) {
    model.addAttribute("foxes", service.getFoxes());
    return "main";
  }

  @GetMapping(value = "/login")
  public String loginPage(Model model ) {
    model.addAttribute("fox", new Fox());
        return "login";
  }

  @PostMapping(value = "/login")
  public String loginPage(Model model, @RequestParam String foxName) {
    model.addAttribute("foxName", service.getFoxByName(foxName));
    return "redirect:/";
  }
}
