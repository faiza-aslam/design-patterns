package com.examples.behavioral.strategy.game;

public class GameCharacter {

  private final AttackStrategy strategy;

  public GameCharacter(AttackStrategy strategy) {
    this.strategy = strategy;
  }

  public void attack() {
    strategy.attack();
  }
}
