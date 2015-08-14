package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Mocha extends CondimentDecorator {


  public Mocha(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription()+",Mocha";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 0.25;
  }
}
