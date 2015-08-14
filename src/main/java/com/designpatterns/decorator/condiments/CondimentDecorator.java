package com.designpatterns.decorator.condiments;

import com.designpatterns.decorator.bevarages.Beverage;

/**
 * Created by nirdosh on 12.08.15.
 */
public abstract  class CondimentDecorator implements Beverage {

  protected Beverage beverage;

  public CondimentDecorator(Beverage beverage){
    this.beverage = beverage;
  }

  public String getDescription(){
    return beverage.getDescription();
  }

  public double getCost(){
    return beverage.getCost();
  }
}
