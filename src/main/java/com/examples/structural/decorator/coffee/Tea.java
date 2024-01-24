package com.examples.structural.decorator.coffee;

public class Tea extends Beverage {

  @Override
  public String getDescription() {
    return "Tea";
  }

  @Override
  public double getCost() {
    return 10;
  }
}
