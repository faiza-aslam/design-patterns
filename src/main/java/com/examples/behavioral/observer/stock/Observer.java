package com.examples.behavioral.observer.stock;

import java.util.Map;

public interface Observer {

  void update(Map<String, Double> stockPrices);
}
