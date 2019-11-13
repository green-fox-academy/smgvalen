package com.smgvalen.frontend.services;

import com.smgvalen.frontend.models.Dountil;
import com.smgvalen.frontend.models.DountilResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DountilService {

  
  public Integer countSum (Dountil dountil){
    Integer sum = 0;
    for (int i = 0; i <= dountil.getUntil(); i++) {
      sum += i;
    }
    return sum;
  }

  public Integer getFactor(Dountil dountil) {
    Integer factor = dountil.getUntil();
    for (int i=1; i < dountil.getUntil(); i++) {
      factor = factor * i;
    }
    return factor;
  }
}
