package com.examples.structural.command.drawingapp;

public class EraseCommand implements Command {

  private final Receiver receiver;

  public EraseCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.erase();
  }
}
