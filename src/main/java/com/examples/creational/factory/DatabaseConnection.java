package com.examples.creational.factory;

public interface DatabaseConnection {

  void connect();

  void disconnect();

  void executeQuery(String query);
}
