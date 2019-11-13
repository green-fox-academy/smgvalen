package com.smgvalen.frontend.models;

import static javax.persistence.GenerationType.IDENTITY;

import com.sun.javafx.beans.IDProperty;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Log {


  private Date createdAt = new Date();
  private String endpoint;
  private String data;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }

  public Log() {
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
//Create a log object which has the following fields:
//createdAt - date and time
//endpoint - string
//data - string