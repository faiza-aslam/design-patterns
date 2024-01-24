package com.examples.structural.proxy.hibernate;

import java.util.UUID;

public class HibernateApp {

  public static void main(String[] args) {
    Entity hibernateProxy = new HibernateProxy(UUID.randomUUID());
    System.out.println(hibernateProxy.getUsername());
  }

}
