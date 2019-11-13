package com.smgvalen.frontend.models;

public class InputForArray {

  private String what;
  private int[] numbers;

  public InputForArray(int[] numbers) {
    this.numbers = numbers;
  }
  public InputForArray(){}

  public InputForArray(int[] numbers, String what){
    this.numbers = numbers;
    this.what = what;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
