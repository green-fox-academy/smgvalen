package com.smgvalen.winniethepooh.controllers;

import com.smgvalen.winniethepooh.models.Inhabitant;
import com.smgvalen.winniethepooh.services.InhabitantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InhabitantController {

  private InhabitantService inhabitantService;

  @Autowired
  public InhabitantController(InhabitantService inhabitantService) {
    this.inhabitantService = inhabitantService;
  }

  @GetMapping(value = "/")
  public String renderMainPage(Model model) {
    String color = "white";
    model.addAttribute("numberOfRooms", inhabitantService.countRooms(color));
    model.addAttribute("color", color);
    return "index";
  }

  @GetMapping(value = "/inhabitants")
  public String renderListOfInhabitants(Model model) {
    model.addAttribute("inhabitantList", inhabitantService.listInhabitants());
    return "listing";
  }

  @GetMapping(value = "/inhabitant/add")
  public String renderAddingPage() {
    return "adding";
  }

  @PostMapping(value = "/inhabitant/add")
  public String saveInhabitant(@ModelAttribute Inhabitant inhabitant) {
    inhabitantService.save(inhabitant);
    return "redirect:/inhabitants";
  }

  @GetMapping(value = "/inhabitant/{id}")
  public String detailsOfInhabitant(Model model, @PathVariable(required = false) Long id) {
    if (id != 0 && inhabitantService.findById(id) != null) {
      model.addAttribute("inhabitant", inhabitantService.findById(id));
      return "details";
    } else {
      return "notfound";
    }
  }

  @GetMapping(value = "/search")
  public String searchByName(@RequestParam String searchedName, Model model) {
    // inhabitantService.findByName(searchedName);
    // model.addAttribute("inhabitant", inhabitantService.findByName(searchedName));
    if (inhabitantService.findByName(searchedName) != null) {
      return "redirect:/inhabitant/" + inhabitantService.findByName(searchedName).getId();
    } else {
      return "redirect:/inhabitant/0";
    }
  }
}
