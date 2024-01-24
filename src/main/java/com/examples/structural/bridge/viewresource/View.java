package com.examples.structural.bridge.viewresource;

public abstract class View {

  protected final IResource resource;

  protected View(IResource resource) {
    this.resource = resource;
  }

  public abstract String show();

}
