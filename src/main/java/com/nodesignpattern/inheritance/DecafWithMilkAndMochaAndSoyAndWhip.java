package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public class DecafWithMilkAndMochaAndSoyAndWhip  extends  Decaf{

  @Override
  public String getDescription() {
    return super.getDescription()+ ",Milk,Mocha,Soy,Whip";
  }

  @Override
  public double getCost() {
    return super.getCost()+1.0;
  }
}
