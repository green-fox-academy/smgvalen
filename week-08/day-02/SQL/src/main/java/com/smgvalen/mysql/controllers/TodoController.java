package com.smgvalen.mysql.controllers;

import com.smgvalen.mysql.models.Assignee;
import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.services.IAssigneeService;
import com.smgvalen.mysql.services.ITodoService;
import java.util.List;
import java.util.stream.Collectors;
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
@RequestMapping(value = "/todo")
public class TodoController {

  private ITodoService service;
  private IAssigneeService assigneeService;

  @Autowired
  public TodoController(ITodoService service, IAssigneeService assigneeService) {
    this.service = service;
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive, Long id) {
    if (isActive == null) {
      model.addAttribute("todos", service.findAll());
    } else {
      List<Todo> todoIsDone = service.findAllByDone(!isActive);

      model.addAttribute("todos", todoIsDone);
     // model.addAttribute("nameOfAssignee", assigneeService.findById(id).getName());
    }
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String addNewTodo(@ModelAttribute(name = "todo") Todo todoToAdd) {
    return "add";
  }

  @PostMapping(value = "/add")
  public String saveNewTodo(@ModelAttribute(name = "todo") Todo todoToAdd) {
    service.save(todoToAdd);
    return "redirect:/todo/";
  }

  @GetMapping(path = "/{id}/delete")
  public String deleteById(Model model, @PathVariable(name = "id") Long id) {
    service.delete(id);
    return "redirect:/todo/";
  }

  @GetMapping(path = "/{id}/edit")
  public String editById(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("todo", service.findById(id));
    model.addAttribute("assignees", assigneeService.findAll());
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String saveById(@ModelAttribute(name = "todo") Todo editedTodo) {
    editedTodo.setAssignee(assigneeService.findById(Long.parseLong(editedTodo.getAssigneeId())));

    service.save(editedTodo);
    return "redirect:/todo/";
  }

  //  @PostMapping(value = "/{newId}/edit")
  //  public String saveById(@RequestParam Long newId, @ModelAttribute(name = "todo") Todo editedTodo) {
  //    editedTodo.getId().setId(newID);
  //    service.save(editedTodo);
  //    return "redirect:/todo/";
  //  }

  @PostMapping(value = "/search")
  public String searchByTitle(Model model, @RequestParam(value = "search") String title) {
    model.addAttribute("todos", service.findTodoByTitle(title));
    return "todolist";
  }

  @PostMapping(value="/assignee/{id}")
  public String showTodosByAssignee(@PathVariable String id, Model model){
    model.addAttribute("todos", assigneeService.findById(Long.parseLong(id)).getTodos().stream().collect(Collectors.toList()));
    return "todolist";
  }


}
