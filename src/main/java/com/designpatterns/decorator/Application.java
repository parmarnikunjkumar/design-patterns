package com.designpatterns.decorator;

import com.designpatterns.decorator.bevarages.Beverage;
import com.designpatterns.decorator.bevarages.Cola;
import com.designpatterns.decorator.bevarages.Decaf;
import com.designpatterns.decorator.bevarages.Espresso;
import com.designpatterns.decorator.condiments.*;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Application {

  public static void main(String[] args) {

    System.out.println("======== Espresso ==============");

    Beverage beverage = new Espresso();

    beverage = new Milk(beverage);

    beverage = new Mocha(beverage);

    beverage = new Soy(beverage);

    beverage = new Whip(beverage);

//    Beverage beverage = new Milk(new Mocha(new Soy( new Whip(new Espresso()))));

    System.out.println(beverage.getDescription());
    System.out.println("Total Cost:" +beverage.getCost());

    System.out.println("============Decaf========================");

    Beverage decaf = new Decaf();
    decaf = new Milk(decaf);
    decaf = new Mocha(decaf);

    System.out.println(decaf.getDescription());
    System.out.println("Total Cost:"+decaf.getCost());


    System.out.println("============Cola========================");

    Beverage cola = new Cola();

    cola = new Ice(cola);


    System.out.println(cola.getDescription());
    System.out.println("Total Cost:"+cola.getCost());


    System.out.println("============Espresso========================");

    Beverage latteMacchiato = new Espresso();

    latteMacchiato = new Macchiato(latteMacchiato);
    latteMacchiato = new Carammel(latteMacchiato);


    System.out.println(latteMacchiato.getDescription());
    System.out.println("Total Cost:"+latteMacchiato.getCost());

  }
}
