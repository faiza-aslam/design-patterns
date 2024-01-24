package com.examples.behavioral.strategy.sorting;

public class SortingContext {

  private final SortingStrategy sortingStrategy;

  public SortingContext(SortingStrategy sortingStrategy) {
    this.sortingStrategy = sortingStrategy;
  }

  public int[] sortNumbers(int[] numbers) {
    return sortingStrategy.sort(numbers);
  }
}
