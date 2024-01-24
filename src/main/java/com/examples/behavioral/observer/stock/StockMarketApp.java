package com.examples.behavioral.observer.stock;

public class StockMarketApp {

  public static void main(String[] args) {
    StockMarket stockMarket = new StockMarket();

    StockTrader trader1 = new StockTrader("Trader1");
    StockTrader trader2 = new StockTrader("Trader2");

    stockMarket.add(trader1);
    stockMarket.add(trader2);

    // Simulate stock price changes
    stockMarket.setStockPrice("APPLE", 150.0);
    stockMarket.setStockPrice("GOOGLE", 2500.0);

    stockMarket.remove(trader2);

    stockMarket.setStockPrice("GOOGLE", 2000.0);
  }

}
