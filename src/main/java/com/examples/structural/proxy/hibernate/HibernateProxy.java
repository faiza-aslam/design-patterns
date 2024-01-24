package com.examples.structural.proxy.hibernate;

import java.util.UUID;

public class HibernateProxy implements Entity {

  private UUID id;
  private String username;

  private EmployeeEntity employeeEntity;

  public HibernateProxy(UUID id) {
    this.id = id;
  }

  @Override
  public UUID getId() {
    return id;
  }

  @Override
  public String getUsername() {
    if (employeeEntity == null) {
      this.employeeEntity = new EmployeeEntity(id);
    }
    return employeeEntity.getUsername();
  }
}
