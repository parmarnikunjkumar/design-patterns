package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public abstract class Espresso implements BeverageInh, com.designpatterns.decorator.bevarages.Beverage {
  public  String getDescriptoin() {
    return "Espresso";
  }

  public double getCost() {
    return 2.0;
  }
}
