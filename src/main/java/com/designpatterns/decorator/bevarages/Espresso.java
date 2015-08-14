package com.designpatterns.decorator.bevarages;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Espresso implements Beverage {

  public String getDescription() {
    return "Espresso";
  }

  public double getCost() {
    return 2.0;
  }
}
