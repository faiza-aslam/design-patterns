package com.examples.creational.abstractfactory;

public class MySQLV2Query implements Query {

  @Override
  public String getQuery() {
    return "select * from users_v2";
  }
}
