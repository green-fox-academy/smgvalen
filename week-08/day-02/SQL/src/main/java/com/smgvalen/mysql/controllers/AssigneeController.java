package com.smgvalen.mysql.controllers;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.services.IAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AssigneeController {

  private IAssigneeService service;

  @Autowired
  public AssigneeController(IAssigneeService service) {
    this.service = service;
  }

  @GetMapping(value = "/assignee")
  public String listOfAssignees(Model model) {
    model.addAttribute("assignees", service.findAll());
    return "assigneelist";
  }

  @GetMapping(path = "/assignee/{id}/edit")
  public String editAssignee(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("assignee", service.findById(id));
    return "editassignee";
  }

  @PostMapping(value = "/assignee/{id}/edit")
  public String updateAssignee(@PathVariable(name = "id") Long id,
      @ModelAttribute Assignee assignee) {
    assignee.setEmail(service.findById(id).getEmail());
    service.save(assignee);
    return "redirect:/assignee/";
  }
}
