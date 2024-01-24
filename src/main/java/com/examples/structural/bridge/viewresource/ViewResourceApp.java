package com.examples.structural.bridge.viewresource;

public class ViewResourceApp {

  public static void main(String[] args) {
    View longView = new LongView(new BookResource(new HeadFirstDesignPatternBook()));
    System.out.println(longView.show());

    View shortView = new ShortView(new BookResource(new HeadFirstDesignPatternBook()));
    System.out.println(shortView.show());

    View thumbnail = new ThumbnailView(new BookResource(new HeadFirstDesignPatternBook()));
    System.out.println(thumbnail.show());
  }

}
