package io.rundev.local;

import io.rundev.local.component.BasicCar;
import io.rundev.local.component.Car;
import io.rundev.local.decorator.LuxuryCar;
import io.rundev.local.decorator.SportsCar;

public class DecoratorPatternTest {

  public static void main(String[] args) {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println("\n*******");

    Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
    sportsLuxuryCar.assemble();
  }
}
