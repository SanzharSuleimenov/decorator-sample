package io.rundev.local.decorator;

import io.rundev.local.component.Car;

public class CoreDecorator implements Car {

  protected Car car;

  public CoreDecorator(Car car) {
    this.car = car;
  }

  @Override
  public void assemble() {
    car.assemble();
  }
}
