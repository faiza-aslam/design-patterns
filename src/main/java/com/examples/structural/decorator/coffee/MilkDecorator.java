package com.examples.structural.decorator.coffee;

public class MilkDecorator extends AddOnDecorator {

  public MilkDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + " + milk";
  }

  @Override
  public double getCost() {
    return this.beverage.getCost() + 5;
  }
}
