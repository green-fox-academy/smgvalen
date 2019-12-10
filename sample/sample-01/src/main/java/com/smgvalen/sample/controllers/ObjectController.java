package com.smgvalen.sample.controllers;

import com.smgvalen.sample.services.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ObjectController {

  private ObjectService objectService;

  @Autowired
  public ObjectController(ObjectService objectService) {
    this.objectService = objectService;
  }
}
