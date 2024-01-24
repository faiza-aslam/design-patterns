package com.examples.creational.singleton;

public class ConfigurationManager {

  // The single instance of the ConfigurationManager
  private static ConfigurationManager instance;

  // Private constructor to prevent instantiation
  private ConfigurationManager() {
    // Initialization code, if needed
  }

  // Method to get the single instance of the ConfigurationManager
  public static ConfigurationManager getInstance() {
    if (instance == null) {
      instance = new ConfigurationManager();
    }
    return instance;
  }

  // Method to retrieve a configuration value
  public String getConfigValue(String key) {
    // Logic to retrieve the configuration value based on the key
    // For simplicity, let's assume a default value is returned if the key is not found
    return "Default " + key + " Value";
  }

}
