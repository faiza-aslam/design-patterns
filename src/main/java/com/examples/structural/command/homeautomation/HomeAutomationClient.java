package com.examples.structural.command.homeautomation;

public class HomeAutomationClient {

  public static void main(String[] args) {
    // Create instances of receiver and commands
    LightReceiver smartLights = new SmartLight();
    Command lightsOnCommand = new LightOnCommand(smartLights);
    Command lightsOffCommand = new LightOffCommand(smartLights);

    // Create invoker (control panel)
    ControlPanel controlPanel = new ControlPanel();

    // Set commands for different buttons in the control panel
    controlPanel.setCommand(lightsOnCommand);
    controlPanel.pressButton();  // Output: Smart lights turned on

    controlPanel.setCommand(lightsOffCommand);
    controlPanel.pressButton();  // Output: Smart lights turned off
  }

}
