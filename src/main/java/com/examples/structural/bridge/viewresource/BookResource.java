package com.examples.structural.bridge.viewresource;

public class BookResource implements IResource {

  private final Book book;

  public BookResource(Book book) {
    this.book = book;
  }

  @Override
  public String getSummary() {
    return this.book.getPreface();
  }

  @Override
  public String getTitle() {
    return this.book.getName();
  }

  @Override
  public String getImage() {
    return this.book.getCoverImage();
  }

  @Override
  public String getUrl() {
    return "www.somefakeurl.com";
  }
}
