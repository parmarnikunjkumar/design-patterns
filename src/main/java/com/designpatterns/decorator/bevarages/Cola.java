package com.designpatterns.decorator.bevarages;

/**
 * Created by nirdosh on 13.08.15.
 */
public class Cola  implements  Beverage{
  public String getDescription() {
    return "Cola";
  }

  public double getCost() {
    return 1.5;
  }
}
