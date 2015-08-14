package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 13.08.15.
 */
public class Ice extends CondimentDecorator {

  public Ice(Beverage beverage) {
    super(beverage);

    System.out.println("Adding Ice");
  }

  @Override
  public String getDescription() {
    return super.getDescription()+",Ice";
  }

  @Override
  public double getCost() {
    return super.getCost();
  }
}
