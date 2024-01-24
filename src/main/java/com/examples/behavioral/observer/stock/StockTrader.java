package com.examples.behavioral.observer.stock;

import java.util.Map;

public class StockTrader implements Observer {

  private final String traderName;

  public StockTrader(String traderName) {
    this.traderName = traderName;
  }

  @Override
  public void update(Map<String, Double> stockPrices) {
    System.out.println(traderName + " received stock price updates: " + stockPrices);
  }
}
