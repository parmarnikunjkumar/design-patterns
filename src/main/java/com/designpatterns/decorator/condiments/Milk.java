package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Milk extends CondimentDecorator {

  public Milk(Beverage beverage) {

    super(beverage);

    System.out.println("Adding Milk");

  }

  public String getDescription(){
    return super.getDescription()+ ",Milk";
  }

  public double getCost(){
    return super.getCost() + 0.25;
  }
}
