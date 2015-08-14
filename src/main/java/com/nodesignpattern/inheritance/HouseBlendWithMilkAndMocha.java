package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public class HouseBlendWithMilkAndMocha extends  HouseBlend{

  @Override
  public String getDescription() {
    return super.getDescription()+",Milk,Mocha";
  }

  @Override
  public double getCost() {
    return super.getCost()+0.5;
  }
}
