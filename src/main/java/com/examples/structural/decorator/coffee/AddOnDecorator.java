package com.examples.structural.decorator.coffee;

public abstract class AddOnDecorator extends Beverage {

  protected final Beverage beverage;

  protected AddOnDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  public abstract double getCost();

}
