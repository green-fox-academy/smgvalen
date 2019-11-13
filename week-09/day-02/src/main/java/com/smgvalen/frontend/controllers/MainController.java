package com.smgvalen.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class MainController {

  @RequestMapping(value= "/")
  public String showIndex(){
    return "index";
  }
}

