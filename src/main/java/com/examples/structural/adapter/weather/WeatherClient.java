package com.examples.structural.adapter.weather;

public class WeatherClient {

  public static void main(String[] args) {
    // Using the Adapter to make XMLWeatherService work with JSONWeatherService
    XMLWeatherService xmlService = new XMLWeatherService();
    JSONWeatherService adapter = new XMLToJSONAdapter(xmlService);

    // Client code can now use the JSONWeatherService interface
    String jsonWeatherData = adapter.requestWeatherData();
    System.out.println("Received JSON weather data: " + jsonWeatherData);
  }

}
