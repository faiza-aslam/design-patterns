package com.examples.creational.abstractfactory;

public interface DatabaseConnection {

  void connect();

  void disconnect();

  void executeQuery(String query);

}
