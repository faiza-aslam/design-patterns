package com.examples.structural.proxy.bookparser;

public class BookParsingApp {

  public static void main(String[] args) {
    IBookParser eager = new BookParser("some complex book - eager");
    eager.getNumberOfPages();

    IBookParser lazy = new LazyBookParserProxy("some complex book - lazy");
    lazy.getNumberOfPages();
  }

}
