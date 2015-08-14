package com.designpatterns.decorator.bevarages;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Decaf implements Beverage {
  public String getDescription() {
    return "Decaf";
  }

  public double getCost() {
    return 2.0;
  }
}
