package com.smgvalen.frontend.models;

public class SithText {

  private String text = "This is my example sentence. Just for fun.";

  public SithText(String text) {
    this.text = text;
  }

  public SithText(){}

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
