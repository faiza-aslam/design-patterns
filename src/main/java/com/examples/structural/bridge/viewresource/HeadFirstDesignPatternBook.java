package com.examples.structural.bridge.viewresource;

public class HeadFirstDesignPatternBook implements Book {

  @Override
  public String getPreface() {
    return "This is Head First Design Pattern Book Preface";
  }

  @Override
  public String getName() {
    return "Head First Design Pattern";
  }

  @Override
  public String getCoverImage() {
    return "HFDP cover image";
  }
}
