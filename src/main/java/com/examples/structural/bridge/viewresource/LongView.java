package com.examples.structural.bridge.viewresource;

public class LongView extends View {

  public LongView(IResource resource) {
    super(resource);
  }

  @Override
  public String show() {
    return "Long view with summary=" + resource.getSummary() + ", title=" + resource.getTitle()
        + ", image=" + resource.getImage();
  }
}
