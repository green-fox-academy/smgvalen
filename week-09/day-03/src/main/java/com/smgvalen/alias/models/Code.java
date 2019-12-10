package com.smgvalen.alias.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Code {

  private String secretCode;

  public void setSecretCode(String secretCode) {
    this.secretCode = secretCode;
  }

  public String getSecretCode() {
    return secretCode;
  }
}
