package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Soy extends CondimentDecorator {


  public Soy(Beverage beverage) {
    super(beverage);
    System.out.println("Adding Soy");
  }

  @Override
  public String getDescription() {
    return beverage.getDescription()+",Soy";
  }

  @Override
  public double getCost() {
    return beverage.getCost()+0.25;
  }
}
