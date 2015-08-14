package com.designpatterns.decorator.bevarages;

/**
 * Created by nirdosh on 12.08.15.
 */
public class HouseBlend  implements Beverage {
  public String getDescription() {
    return "HouseBlend";
  }

  public double getCost() {
    return 0;
  }
}
