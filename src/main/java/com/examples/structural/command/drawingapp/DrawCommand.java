package com.examples.structural.command.drawingapp;

public class DrawCommand implements Command {

  private final Receiver receiver;

  public DrawCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    this.receiver.draw();
  }
}
