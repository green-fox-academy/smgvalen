package com.smgvalen.alias.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NoContentException extends RuntimeException {

  private String noContentError = "The provided secret code matches delete the entry from the database.";

  public String getNoContentError() {
    return noContentError;
  }

  @Override
  public String toString() {
    return getNoContentError();
  }

  @Override
  public String getMessage() {
    return getNoContentError();
  }
}
