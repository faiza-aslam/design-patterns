package com.examples.structural.command.homeautomation;

public class ControlPanel {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }

}
