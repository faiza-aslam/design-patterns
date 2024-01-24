package com.examples.structural.command.drawingapp;

public class Toolbar {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void onButtonClick() {
    command.execute();
  }
}
