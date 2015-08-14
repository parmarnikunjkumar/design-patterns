package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public class HouseBlendWithMilkAndWhip  extends  HouseBlend{

  @Override
  public double getCost() {
    return super.getCost()+ 0.5;
  }

  @Override
  public String getDescription() {
    return super.getDescription()+",Milk,Whip";
  }
}
