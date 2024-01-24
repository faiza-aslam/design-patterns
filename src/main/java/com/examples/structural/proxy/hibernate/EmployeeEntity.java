package com.examples.structural.proxy.hibernate;

import java.util.UUID;

public class EmployeeEntity implements Entity {

  private UUID id;
  private String username;

  public EmployeeEntity(UUID id) {
    readFromDatabase(id);
  }

  @Override
  public UUID getId() {
    return id;
  }

  @Override
  public String getUsername() {
    return username;
  }

  private void readFromDatabase(UUID id) {
    this.id = id;
    this.username = "Test Employee";
  }
}
