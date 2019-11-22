package com.smgvalen.alias.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

  private String error = "There is no such a thing here what you're looking for!";

  @Override
  public String getMessage() {
    return getError();
  }

  public String getError() {
    return error;
  }
}