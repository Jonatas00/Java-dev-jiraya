package jiraya.dev.javacore.Fstaticmodifier.test;

import jiraya.dev.javacore.Fstaticmodifier.domain.Car;

public class CarTest01 {
  public static void main(String[] args) {
    Car c1 = new Car("BMW M3 E92", 337);
    Car c2 = new Car("Audi a8", 267);
    Car c3 = new Car("BMW M4 CSL", 307);

    Car.setSpeedLimit(199);

    c1.showInfos();
    c2.showInfos();
    c3.showInfos();
  }
}
