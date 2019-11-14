package com.smgvalen.mysql.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  @Column(name = "is_urgent")
  private boolean urgent;
  @Column(name = "is_done")
  private boolean done;
  @ManyToOne()
  private Assignee assignee;
  @Transient
  private String assigneeId;
  private String creationDate = formatDate();
  private String dueDate;

  public void setAssignee(Assignee assignee) {
    // assignee.addTodo(this);
    this.assignee = assignee;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public String getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = false;
    this.done = false;

  }

  public Todo() {
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public String getAssigneeName() {
    if (assignee == null) {
      return "no assignee";
    } else {
      return assignee.getName();
    }
  }
/*  public Long getAssigneeFieldId() {
    if (assignee == null) {
      return 0L;
    } else {
      return assignee.getId();
    }
  }  */


  private String formatDate() {
    String stringDateFormat = "yyyy-MM-dd/hh:mm";
    DateFormat dateFormat = new SimpleDateFormat(stringDateFormat);
    String formattedDate = dateFormat.format(new Date());
    return formattedDate;
  }

}


