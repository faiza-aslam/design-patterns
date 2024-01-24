package com.examples.creational.abstractfactory;

public class MySQLQuery implements Query {

  @Override
  public String getQuery() {
    return "select * from users";
  }
}
