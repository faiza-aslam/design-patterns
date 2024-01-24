package com.examples.creational.abstractfactory;

public interface DatabaseFactory {

  DatabaseConnection createConnection();

  Query createQuery();

}
