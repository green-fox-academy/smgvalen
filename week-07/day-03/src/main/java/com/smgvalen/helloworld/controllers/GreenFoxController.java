package com.smgvalen.helloworld.controllers;

import com.smgvalen.helloworld.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {

  private StudentService greenFoxService;

  @Autowired
  public GreenFoxController(StudentService greenFoxService) {
    this.greenFoxService = greenFoxService;
  }

  // - Before the links have a header containing the current user count
  // - Extend the service with a `count` method
  @GetMapping (value ="/gfa")
  public String showMainPage(Model model) {
    model.addAttribute("count", greenFoxService.count());
    return "gfa";
  }

  @GetMapping(value = "/gfa/list")
  public String listStudents(Model model) {
    model.addAttribute("list", greenFoxService.findAll());
    return "listing";
  }
  // - Extend the links
  //     - Add new Student
  // - Add new student at new `/gfa/add` endpoint
  //     - should contain a form with an input for the new student's name
  //     - send the form to the `POST /gfa/save` endpoint
  //         - where you can use the service's `save` to save it
  @GetMapping (value = "/gfa/add")
  public String addNames() {
    return "addingName";
  }
  @PostMapping(value="/gfa/save")
  public String saveStudent(@RequestParam String name) {
    greenFoxService.save(name);
    return "redirect:/gfa";
  }
  @GetMapping (value="/gfa/check")
  public String checkIfExist(@RequestParam (required = false) String name, Model model) {
    if (greenFoxService.contains(name)) {
      model.addAttribute("inputName", name);
    } else {
      model.addAttribute("falseInputName", name);
    }
    return "checker";
  }
  // ## Add a student checker page at `/gfa/check`
  // - With a form for a `name`
  // - Submitting a name the app can display if the student is already in the list
  // - Add a link to the main page
}
