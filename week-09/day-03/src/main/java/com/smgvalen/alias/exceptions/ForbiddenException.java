package com.smgvalen.alias.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException{

  private String forbiddenError = "The provided secret code doesn't match with anything.";

  public String getForbiddenError() {
    return forbiddenError;
  }

  @Override
  public String getMessage(){
    return getForbiddenError();
  }
}
