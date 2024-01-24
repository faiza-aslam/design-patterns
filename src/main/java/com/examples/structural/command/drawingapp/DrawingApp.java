package com.examples.structural.command.drawingapp;

public class DrawingApp {

  public static void main(String[] args) {
    // Create instances of receiver and commands
    Receiver canvas = new Canvas();
    Command drawCommand = new DrawCommand(canvas);
    Command eraseCommand = new EraseCommand(canvas);

    // Create invoker (toolbar)
    Toolbar toolbar = new Toolbar();

    // Set commands for different buttons in the toolbar
    toolbar.setCommand(drawCommand);
    toolbar.onButtonClick();

    toolbar.setCommand(eraseCommand);
    toolbar.onButtonClick();
  }

}
