package com.examples.creational.singleton;

public class Application {

  public static void main(String[] args) {
    // Get the configuration manager instance
    ConfigurationManager configManager = ConfigurationManager.getInstance();

    // Retrieve configuration values
    String dbConnectionString = configManager.getConfigValue("DBConnectionString");
    String apiKey = configManager.getConfigValue("APIKey");

    // Use the configuration values in the application
    System.out.println("Database Connection String: " + dbConnectionString);
    System.out.println("API Key: " + apiKey);
  }
}
