package com.smgvalen.frontend.models;

public class Appended {

  private String appended;

  public Appended(String appended) {
    this.appended = appended + "a";
  }

  public Appended(){}

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
