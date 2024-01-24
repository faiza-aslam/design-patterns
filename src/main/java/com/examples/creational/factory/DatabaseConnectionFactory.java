package com.examples.creational.factory;

public class DatabaseConnectionFactory {

  public static DatabaseConnection createConnection(String databaseType) {
    return switch (databaseType.toLowerCase()) {
      case "mysql" -> new MySQLDatabaseConnection();
      case "postgresql" -> new PostgreSQLDatabaseConnection();
      default -> throw new IllegalArgumentException("Unsupported database type");
    };
  }

}
