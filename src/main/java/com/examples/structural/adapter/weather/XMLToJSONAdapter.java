package com.examples.structural.adapter.weather;

public class XMLToJSONAdapter implements JSONWeatherService {

  private final XMLWeatherService xmlWeatherService;

  public XMLToJSONAdapter(XMLWeatherService xmlWeatherService) {
    this.xmlWeatherService = xmlWeatherService;
  }

  @Override
  public String requestWeatherData() {
    // Adapt XML data to JSON format
    String xmlData = xmlWeatherService.getWeatherData();
    // Assume a simple conversion from XML to JSON for demonstration purposes
    return convertXMLtoJSON(xmlData);
  }

  // Simulate XML to JSON conversion (for illustration purposes)
  private String convertXMLtoJSON(String xmlData) {
    // Simplified conversion logic, actual implementation may vary
    return "{\"temperature\": 25, \"condition\": \"Cloudy\"}";
  }
}
