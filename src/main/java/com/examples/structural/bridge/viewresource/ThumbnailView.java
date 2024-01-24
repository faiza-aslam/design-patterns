package com.examples.structural.bridge.viewresource;

public class ThumbnailView extends View {

  public ThumbnailView(IResource resource) {
    super(resource);
  }

  @Override
  public String show() {
    return "Thumbnail view with image=" + resource.getImage();
  }
}
