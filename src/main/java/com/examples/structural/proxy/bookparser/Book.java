package com.examples.structural.proxy.bookparser;

public class Book {

  private final int numberOfPages;

  public Book(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

}
