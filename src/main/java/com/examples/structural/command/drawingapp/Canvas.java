package com.examples.structural.command.drawingapp;

public class Canvas implements Receiver {

  @Override
  public void draw() {
    System.out.println("Drawing a shape on the canvas");
  }

  @Override
  public void erase() {
    System.out.println("Erasing a shape from the canvas");
  }
}
