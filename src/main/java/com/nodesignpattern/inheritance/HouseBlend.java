package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public abstract class HouseBlend implements BeverageInh{

  public String getDescription() {
    return "HouseBlend";
  }

  public double getCost() {
    return 2.0;
  }
}
