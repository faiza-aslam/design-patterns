package com.examples.creational.abstractfactory;

public class MySQLDatabaseConnection implements DatabaseConnection {

  @Override
  public void connect() {
    System.out.println("Connecting to MySQL database");
  }

  @Override
  public void disconnect() {
    System.out.println("Disconnecting from MySQL database");
  }

  @Override
  public void executeQuery(String query) {
    System.out.println("Executing MySQL query: " + query);
  }
}
