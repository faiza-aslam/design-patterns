package com.examples.behavioral.strategy.sorting;

public class SelectionSort implements SortingStrategy {

  @Override
  public int[] sort(int[] numbers) {
    System.out.println("Selection Sort!");
    int i, j, first, temp;
    for (i = numbers.length - 1; i > 0; i--) {
      first = 0;
      for (j = 1; j <= i; j++) {
        if (numbers[j] > numbers[first]) {
          first = j;
        }
      }
      temp = numbers[first];
      numbers[first] = numbers[i];
      numbers[i] = temp;
    }
    return numbers;
  }
}
