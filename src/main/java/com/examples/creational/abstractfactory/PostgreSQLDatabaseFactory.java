package com.examples.creational.abstractfactory;

public class PostgreSQLDatabaseFactory implements DatabaseFactory {

  @Override
  public DatabaseConnection createConnection() {
    return new PostgreSQLDatabaseConnection();
  }

  @Override
  public Query createQuery() {
    return new PostgreSQLQuery();
  }
}
