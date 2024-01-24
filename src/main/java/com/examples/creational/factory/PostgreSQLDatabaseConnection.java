package com.examples.creational.factory;

public class PostgreSQLDatabaseConnection implements DatabaseConnection {

  @Override
  public void connect() {
    System.out.println("Connecting to PostgreSQL database");
  }

  @Override
  public void disconnect() {
    System.out.println("Disconnecting from PostgreSQL database");
  }

  @Override
  public void executeQuery(String query) {
    System.out.println("Executing PostgreSQL query: " + query);
  }
}
