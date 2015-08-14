package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 13.08.15.
 */
public class DecafWithMilkAndMochaAndSoy  extends  Decaf{

  @Override
  public String getDescription() {
    return super.getDescription()+",Milk,Mocha,Soy";
  }

  @Override
  public double getCost() {
    return super.getCost()+0.75;
  }
}
