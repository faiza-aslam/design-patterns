package com.examples.structural.command.homeautomation;

public class SmartLight implements LightReceiver {

  @Override
  public void turnOn() {
    System.out.println("Smart lights turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("Smart lights turned off");
  }
}
