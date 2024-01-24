package com.examples.structural.proxy.bookparser;

public class LazyBookParserProxy implements IBookParser {

  private final String book;
  private BookParser bookParser = null;

  public LazyBookParserProxy(String book) {
    this.book = book;
  }

  @Override
  public int getNumberOfPages() {
    if (bookParser == null) {
      this.bookParser = new BookParser(book);
    }
    return bookParser.getNumberOfPages();
  }

}
