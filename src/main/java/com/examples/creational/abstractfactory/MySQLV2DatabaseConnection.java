package com.examples.creational.abstractfactory;

public class MySQLV2DatabaseConnection implements DatabaseConnection {

  @Override
  public void connect() {
    System.out.println("Connecting to MySQL v2 database");
  }

  @Override
  public void disconnect() {
    System.out.println("Disconnecting from MySQL v2 database");
  }

  @Override
  public void executeQuery(String query) {
    System.out.println("Executing MySQL v2 query: " + query);
  }
}
