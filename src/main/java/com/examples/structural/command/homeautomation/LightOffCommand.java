package com.examples.structural.command.homeautomation;

public class LightOffCommand implements Command {

  private final LightReceiver receiver;

  public LightOffCommand(LightReceiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.turnOff();
  }
}
