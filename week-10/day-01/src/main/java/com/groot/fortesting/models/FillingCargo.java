package com.groot.fortesting.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FillingCargo {

  private String recieved;
  private Integer amount;
  private String shipstatus;
  private Boolean ready = false;

  public FillingCargo(String recieved, Integer amount, String shipstatus, Boolean ready) {
    this.recieved = recieved;
    this.amount = amount;
    this.shipstatus = shipstatus;
    this.ready = ready;
  }

  public FillingCargo() {
  }

  public String getRecieved() {
    return recieved;
  }

  public void setRecieved(String recieved) {
    this.recieved = recieved;
  }

  public Integer getAmount() {
      return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }


}
