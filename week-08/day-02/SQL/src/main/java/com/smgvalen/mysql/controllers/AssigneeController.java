package com.smgvalen.mysql.controllers;

import com.smgvalen.mysql.services.IAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssigneeController {

  private IAssigneeService service;

  @Autowired
  public AssigneeController(IAssigneeService service) {
    this.service = service;
  }

  @GetMapping(value = "/assignee")
  public String listOfAssignees(Model model){
    model.addAttribute("assignees", service.findAll());
    return "assigneelist";
  }
}
