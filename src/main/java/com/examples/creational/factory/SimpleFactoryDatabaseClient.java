package com.examples.creational.factory;

public class SimpleFactoryDatabaseClient {

  public static void main(String[] args) {
    // Using MySQL database components
    DatabaseConnection mySQLConnection = DatabaseConnectionFactory.createConnection("MySQL");
    mySQLConnection.connect();
    mySQLConnection.executeQuery("select * from users");
    mySQLConnection.disconnect();

    // Using PostgreSQL database components
    DatabaseConnection postgreSQLConnection = DatabaseConnectionFactory.createConnection("PostgreSQL");
    postgreSQLConnection.connect();
    postgreSQLConnection.executeQuery("select * from companies");
    postgreSQLConnection.disconnect();
  }
}
