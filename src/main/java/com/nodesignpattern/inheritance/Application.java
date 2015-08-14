package com.nodesignpattern.inheritance;

/**
 * Created by nirdosh on 12.08.15.
 */
public class Application {

  public static void main(String[] args) {

    DarkRoastWithMillkAndMochaAndSoyAndWhip bevearge = new DarkRoastWithMillkAndMochaAndSoyAndWhip();

    

    System.out.println(bevearge.getDescription());
    System.out.println(bevearge.getCost());

    System.out.println("====================");
    DarkRoast darkRoast = new DarkRoastWithMilkAndMochaAndWhip();

    System.out.println(darkRoast.getDescription());
    System.out.println(darkRoast.getCost());
  }
}
