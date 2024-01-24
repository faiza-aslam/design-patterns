package com.examples.structural.proxy.bookparser;

public class BookParser implements IBookParser {

  private final Book book;

  public BookParser(String bookString) {
    //expensive parsing
    System.out.println("Parsing a book " + bookString);
    this.book = new Book(600);
  }

  @Override
  public int getNumberOfPages() {
    return book.getNumberOfPages();
  }

}
