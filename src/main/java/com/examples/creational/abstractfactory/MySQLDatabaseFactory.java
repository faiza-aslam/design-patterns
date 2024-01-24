package com.examples.creational.abstractfactory;

public class MySQLDatabaseFactory implements DatabaseFactory {

  @Override
  public DatabaseConnection createConnection() {
    return new MySQLV2DatabaseConnection();
  }

  @Override
  public Query createQuery() {
    return new MySQLV2Query();
  }
}
