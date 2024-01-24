package com.examples.behavioral.strategy.game;

public class GameAppTest {

  public static void main(String[] args) {
    GameCharacter knight = new GameCharacter(new SwordAttack());
    knight.attack(); // Output: Attacking with a sword!

    GameCharacter archer = new GameCharacter(new BowAttack());
    archer.attack(); // Output: Attacking with a bow!
  }

}
