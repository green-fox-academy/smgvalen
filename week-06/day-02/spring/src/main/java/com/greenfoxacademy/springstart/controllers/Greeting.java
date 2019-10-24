package com.greenfoxacademy.springstart.controllers;

public class Greeting {

  private long id;
  private String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = "Hello, " + content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
