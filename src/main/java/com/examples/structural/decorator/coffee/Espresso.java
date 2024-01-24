package com.examples.structural.decorator.coffee;

public class Espresso extends Beverage {

  @Override
  public String getDescription() {
    return "Espresso";
  }

  @Override
  public double getCost() {
    return 20;
  }
}
