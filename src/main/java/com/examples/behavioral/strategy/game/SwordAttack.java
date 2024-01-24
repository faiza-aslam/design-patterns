package com.examples.behavioral.strategy.game;

public class SwordAttack implements AttackStrategy {

  @Override
  public void attack() {
    System.out.println("Attacking with a sword!");
  }
}
