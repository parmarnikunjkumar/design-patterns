package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public class HouseBlendWithMilkAndSoy  extends  HouseBlend{


  @Override
  public String getDescription() {
    return super.getDescription()+",Milk,Soy";
  }

  @Override
  public double getCost() {
    return super.getCost()+0.5;
  }
}
