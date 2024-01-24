package com.examples.structural.command.homeautomation;

public class LightOnCommand implements Command {

  private final LightReceiver receiver;

  public LightOnCommand(LightReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.turnOn();
  }
}
