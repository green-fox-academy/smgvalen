package com.smgvalen.sample.controllers;

import com.smgvalen.sample.services.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestObjectController {

  private ObjectService objectService;

  @Autowired
  public RestObjectController(ObjectService objectService) {
    this.objectService = objectService;
  }
}
