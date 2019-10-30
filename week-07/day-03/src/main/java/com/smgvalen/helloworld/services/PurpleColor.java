package com.smgvalen.helloworld.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("purple")
public class PurpleColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It's a purple.");
  }
}
