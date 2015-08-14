package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 12.08.15.
 */
public abstract  class DarkRoast implements BeverageInh {
	
  public String getDescription() {
    return "DarkRoast";
  }

  public double getCost() {
    return 2.0;
  }
}
