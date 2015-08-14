package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super(beverage);
    System.out.println("Adding Whip");
  }

  @Override
  public String getDescription() {
    return beverage.getDescription()+",Whip";
  }

  @Override
  public double getCost() {
    return beverage.getCost()+0.25;
  }
}
