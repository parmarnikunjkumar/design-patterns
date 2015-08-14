package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public class DecafWithMilk extends Decaf {


  public String getDescription() {
    return super.getDescription()+",Milk";
  }

  @Override
  public double getCost() {
    return super.getCost()+0.25;
  }

}
