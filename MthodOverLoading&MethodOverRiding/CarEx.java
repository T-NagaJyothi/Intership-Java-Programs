/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting.*/
class Vehicle
  {
    void startEngine()
    {
      System.out.println("Engine starting");
    }
  }
class Car extends Vehicle
  {
    void startEngine()
    {
      System.out.println("car engine starting");
    }
  }
class Motorcycle extends Vehicle
  {
    void startEngine()
    {
      System.out.println("motorcycle engine starting"); 
    }
  }
class CarEx
  {
    public static void main(String[] ags)
    {
      Vehicle v=new Vehicle();
      v.startEngine();
      Vehicle car=new Car();
      car.startEngine();
      Vehicle mc=new Motorcycle();
      mc.startEngine();
    }
  }