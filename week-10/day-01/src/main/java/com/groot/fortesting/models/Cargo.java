package com.groot.fortesting.models;

public class Cargo {

  private Integer caliber25 = 0;
  private Integer caliber30 = 0;
  private Integer caliber50 = 0;
  private String shipstatus = "empty";
  private Boolean ready = false;


  public Cargo() {
  }

  public void fillCargo(String caliber, Integer amount) {
    if (caliber.equals(".25")) {
      this.caliber25 += amount;
    } else if (caliber.equals(".30")) {
      this.caliber30 += amount;
    } else if (caliber.equals(".50")) {
      this.caliber50 += amount;
    }
    if (amount == 0) {
      this.shipstatus = "empty";
      this.ready = false;
    } else if (amount < 12500) {
      Integer percentage = amount * 100 / 12500;
      this.shipstatus = (percentage + "%");
      this.ready = false;
    } else if (amount > 12500) {
      this.shipstatus = "overloaded";
      this.ready = false;
    } else if (amount == 12500) {
      this.ready = true;
      this.shipstatus = "full";
    }
  }

  public Integer getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(Integer caliber25) {
    this.caliber25 = caliber25;
  }

  public Integer getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(Integer caliber30) {
    this.caliber30 = caliber30;
  }

  public Integer getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(Integer caliber50) {
    this.caliber50 = caliber50;
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
