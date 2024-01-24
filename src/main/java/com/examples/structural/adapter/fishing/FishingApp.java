package com.examples.structural.adapter.fishing;

public class FishingApp {

  public static void main(String[] args) {
    Captain captain = new Captain(new FishingBoatAdapter(new FishingBoat()));
    captain.row();
  }

}
