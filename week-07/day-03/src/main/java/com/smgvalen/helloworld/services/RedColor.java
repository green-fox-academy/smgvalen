package com.smgvalen.helloworld.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {

  Print print;

  @Autowired
  public RedColor(Print print) {
    this.print = print;
  }

  @Override
  public void printColor() {
    print.log("It's a red!");
  }
}
