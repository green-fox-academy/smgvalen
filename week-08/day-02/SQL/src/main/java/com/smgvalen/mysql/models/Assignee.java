package com.smgvalen.mysql.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.MERGE, mappedBy = "assignee", fetch = FetchType.EAGER)
 // @JoinColumn(name = "assignee_id")
  private List<Todo> todos = new ArrayList<>();

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }


  public Assignee() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }


  public void addTodo(Todo todo) {
    todos.add(todo);
  }
}
