package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 13.08.15.
 */
public class Macchiato  extends CondimentDecorator {

  public Macchiato(Beverage beverage){
    super(beverage);
    System.out.println("Adding Macchiato");
  }

  @Override
  public double getCost() {
    return super.getCost()+0.75;
  }

  @Override
  public String getDescription() {
    return super.getDescription()+",Macchiato";
  }
}
