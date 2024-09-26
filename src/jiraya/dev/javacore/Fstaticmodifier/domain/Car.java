package jiraya.dev.javacore.Fstaticmodifier.domain;

public class Car {
  private String name;
  private double maxSpeed;
  private static double speedLimit = 250;

  public Car(String name, double maxSpeed) {
    this.name = name;
    this.maxSpeed = maxSpeed;
  }

  public void showInfos() {
    System.out.println("-=-=-=-");
    System.out.println("name:" + this.name);
    System.out.println("Max speed:" + this.maxSpeed);
    System.out.println("Speed limit: " + Car.speedLimit);
    System.out.println("-=-=-=-");
  }

  public static void setSpeedLimit(double speedLimit) {
    Car.speedLimit = speedLimit;
  }

  public static double getSpeedLimit() {
    return Car.speedLimit;
  }

  // #region Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(double maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  // #endregion

}
