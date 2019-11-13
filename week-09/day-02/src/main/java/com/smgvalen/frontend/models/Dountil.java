package com.smgvalen.frontend.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Dountil {

  private Integer until;

  public Dountil(Integer until){
    this.until = until;
  }
  public Dountil(){}

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
}