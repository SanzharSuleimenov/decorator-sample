package io.rundev.local.decorator;

import io.rundev.local.component.Car;

public class SportsCar extends CoreDecorator {

  public SportsCar(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding features of Sports Car.");
  }
}
