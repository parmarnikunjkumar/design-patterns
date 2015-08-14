package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public abstract  class Decaf implements  BeverageInh {

  public double getCost() {
    return 2.0;
  }

  public String getDescription() {
    return "Decaf";
  }
}
