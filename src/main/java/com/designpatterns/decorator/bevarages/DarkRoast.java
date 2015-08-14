package com.designpatterns.decorator.bevarages;

import com.nodesignpattern.inheritance.BeverageInh;

/**
 * Created by nirdosh on 12.08.15.
 */
public class DarkRoast implements Beverage {
  public String getDescription() {
    return "DarkRoast";
  }

  public double getCost() {
    return 2.0;
  }

}
