package com.examples.structural.decorator.coffee;

public class SugarDecorator extends AddOnDecorator {

  public SugarDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + " + sugar";
  }

  @Override
  public double getCost() {
    return this.beverage.getCost() + 10;
  }
}
