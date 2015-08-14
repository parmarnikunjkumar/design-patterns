package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 13.08.15.
 */
public class Carammel extends CondimentDecorator {

  public Carammel(Beverage beverage) {
    super(beverage);
    System.out.println("Adding Carammel");
  }

  @Override
  public String getDescription() {
    return super.getDescription()+",Carammel";

  }

  @Override
  public double getCost() {
    return super.getCost()+ 0.5;
  }
}
