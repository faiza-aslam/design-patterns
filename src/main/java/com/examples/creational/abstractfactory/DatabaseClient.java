package com.examples.creational.abstractfactory;

public class DatabaseClient {

  public static void main(String[] args) {
    // Using MySQL database
    DatabaseFactory mySQLFactory = new MySQLDatabaseFactory();
    DatabaseConnection mySQLConnection = mySQLFactory.createConnection();
    Query mySQLQuery = mySQLFactory.createQuery();
    mySQLConnection.connect();
    mySQLConnection.executeQuery(mySQLQuery.getQuery());
    mySQLConnection.disconnect();

    // Using PostgreSQL database
    DatabaseFactory postgreSQLFactory = new PostgreSQLDatabaseFactory();
    DatabaseConnection postgreSQLConnection = postgreSQLFactory.createConnection();
    Query postgreSQLQuery = postgreSQLFactory.createQuery();
    postgreSQLConnection.connect();
    postgreSQLConnection.executeQuery(postgreSQLQuery.getQuery());
    postgreSQLConnection.disconnect();
  }
}
