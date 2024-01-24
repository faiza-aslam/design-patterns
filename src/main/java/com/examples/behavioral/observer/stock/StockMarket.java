package com.examples.behavioral.observer.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket implements Subject {

  private final Map<String, Double> stockPrices;
  private final List<Observer> observers;

  public StockMarket() {
    stockPrices = new HashMap<>();
    observers = new ArrayList<>();
  }

  @Override
  public void add(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void remove(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(stockPrices);
    }
  }

  public void setStockPrice(String stockSymbol, double price) {
    stockPrices.put(stockSymbol, price);
    notifyObservers();
  }

  public Map<String, Double> getStockPrices() {
    return new HashMap<>(stockPrices);
  }

}
