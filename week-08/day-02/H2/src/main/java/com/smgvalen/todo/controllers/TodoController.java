package com.smgvalen.todo.controllers;

import com.smgvalen.todo.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  private ITodoService service;

  @Autowired
  public TodoController(ITodoService service){
    this.service = service;
  }

  @GetMapping (value= {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", service.findAll());
    return "todolist";
  }
}
