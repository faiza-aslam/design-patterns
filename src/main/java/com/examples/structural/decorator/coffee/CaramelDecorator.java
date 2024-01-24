package com.examples.structural.decorator.coffee;

public class CaramelDecorator extends AddOnDecorator {

  public CaramelDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + " + caramel";
  }

  @Override
  public double getCost() {
    return this.beverage.getCost() + 15;
  }
}
