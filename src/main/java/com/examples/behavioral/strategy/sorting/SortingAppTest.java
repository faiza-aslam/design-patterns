package com.examples.behavioral.strategy.sorting;

import java.util.Arrays;

public class SortingAppTest {

  public static void main(String[] args) {
    int[] numbers = {20, 50, 15, 6, 80};

    SortingContext insertionSortContext = new SortingContext(new InsertionSort());
    System.out.println(Arrays.toString(insertionSortContext.sortNumbers(numbers)));

    System.out.println("*******************");
    SortingContext selectionSortContext = new SortingContext(new SelectionSort());
    System.out.println(Arrays.toString(selectionSortContext.sortNumbers(numbers)));
  }

}
