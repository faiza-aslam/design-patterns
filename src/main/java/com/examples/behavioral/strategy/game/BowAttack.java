package com.examples.behavioral.strategy.game;

public class BowAttack implements AttackStrategy {

  @Override
  public void attack() {
    System.out.println("Attacking with a bow!");
  }
}
