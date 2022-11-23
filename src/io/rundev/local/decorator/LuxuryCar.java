package io.rundev.local.decorator;

import io.rundev.local.component.Car;

public class LuxuryCar extends CoreDecorator {

  public LuxuryCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding features of Luxury Car.");
  }
}
