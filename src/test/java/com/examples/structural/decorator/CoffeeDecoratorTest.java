package com.examples.structural.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.examples.structural.decorator.coffee.Beverage;
import com.examples.structural.decorator.coffee.MilkDecorator;
import com.examples.structural.decorator.coffee.SugarDecorator;
import com.examples.structural.decorator.coffee.Tea;
import org.junit.jupiter.api.Test;

class CoffeeDecoratorTest {

  @Test
  void testTeaWithMilk() {
    Beverage teaWithMilk = new MilkDecorator(new Tea());
    assertEquals("Tea + milk", teaWithMilk.getDescription());
    assertEquals(15.0, teaWithMilk.getCost());
  }

  @Test
  void testTeaWithMilkAndSugar() {
    Beverage teaWithMilk = new MilkDecorator(new SugarDecorator(new Tea()));
    assertEquals("Tea + sugar + milk", teaWithMilk.getDescription());
    assertEquals(25.0, teaWithMilk.getCost());
  }

}
