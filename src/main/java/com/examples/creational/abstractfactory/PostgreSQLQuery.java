package com.examples.creational.abstractfactory;

public class PostgreSQLQuery implements Query {

  @Override
  public String getQuery() {
    return "select * from companies";
  }
}
