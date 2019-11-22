package com.smgvalen.reddit.controllers;

import com.smgvalen.reddit.models.User;
import com.smgvalen.reddit.services.InterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  @Autowired
  private InterUserService userService;

  public UserController(InterUserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public String loginUser(@ModelAttribute(name = "user") User user) {
    return "login";
  }

  @PostMapping("/login")
  public String loginAndSaveUser(@ModelAttribute(name = "user") User user) {
    userService.save(user);
    return "redirect:/";
  }
}
