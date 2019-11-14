package com.smgvalen.mysql.controllers;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.services.IAssigneeService;
import com.smgvalen.mysql.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {

  private IAssigneeService service;
  private ITodoService todoService;

  @Autowired
  public AssigneeController(IAssigneeService service, ITodoService todoService) {
    this.service = service;
    this.todoService = todoService;
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

  @GetMapping(value = "/assignee/add")
  public String goToAddAssigneePage(@ModelAttribute(name = "assignee") Assignee assignee) {
    return "addAssignee";
  }

  @PostMapping(value = "/assignee/add")
  public String saveNewlyAddedAssignee(@ModelAttribute(name = "assignee") Assignee assignee) {
    service.save(assignee);
    return "redirect:/assignee/";
  }

  @GetMapping(path = "/assignee/{id}/delete")
  public String deleteAssigneeById(@PathVariable Long id) {
    service.delete(service.findById(id));
    return "redirect:/assignee/";
  }

  @GetMapping(value="/assignee/{id}")
  public String showTodosByAssignee(@PathVariable Long id, Model model){
    model.addAttribute("todos", todoService.findByAssignee(service.findById(id)));
    return "todolist";
  }
}

