package com.examples.structural.bridge.viewresource;

public class ShortView extends View {

  protected ShortView(IResource resource) {
    super(resource);
  }

  @Override
  public String show() {
    return "Short view with title=" + resource.getTitle() + ", image=" + resource.getImage();
  }
}
