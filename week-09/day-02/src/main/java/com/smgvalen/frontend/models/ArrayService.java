package com.smgvalen.frontend.models;

import org.springframework.stereotype.Service;

@Service
public class ArrayService {

  public Integer sum(InputForArray input) {
    Integer sum = 0;
    for (int i = 0; i < input.getNumbers().length; i++) {
      sum += input.getNumbers()[i];
    }
    return sum;
  }

  public Integer multiply(InputForArray input) {
    Integer multiplied = 1;
    for (int i = 0; i < input.getNumbers().length; i++) {
      multiplied = multiplied * input.getNumbers()[i];
    }
    return multiplied;
  }

  public int[] doubling(InputForArray input) {
    int[] resultArray = input.getNumbers();
    int arrayLength = input.getNumbers().length;
    for (int i = 0; i < arrayLength; i++) {
      resultArray[i] *= 2;
    }
    return resultArray;
  }
}
