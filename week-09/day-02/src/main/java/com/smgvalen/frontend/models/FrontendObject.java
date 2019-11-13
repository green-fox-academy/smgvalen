package com.smgvalen.frontend.models;

public class FrontendObject {

  private Integer received;
  private Integer result;

  public FrontendObject(Integer received) {
    this.received = received;
    this.result = received * 2;
  }

  public FrontendObject() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
