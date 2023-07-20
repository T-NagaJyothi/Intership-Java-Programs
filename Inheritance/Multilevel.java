/*Multilevel Inheritance

Create a class called "Vehicle" with the following attributes:
String make
String model
int numDoors
boolean isConvertible*/
class Vehicle
  {
    void property()
    {
      String make="TATA";
      System.out.println("the vehicle may have some features");
    }
  }
class FourSeater extends Vehicle
  {
    void features()
    {
      String model="safari";
      int numDoor=5;
      System.out.println("the model of car"+model);
      System.out.println("the no of doors "+numDoor);
    }
  }
class Sevenseater extends FourSeater
  {
    public void display()
    {
   boolean isConvertible=false;
      System.out.println("the car is convertible or not"+isConvertible);
  }
  }
class Multilevel
  {
    public static void main(String[] args)
    {
      FourSeater f=new FourSeater();
      f.property();
      f.features();
      Sevenseater s=new Sevenseater();
      s.display();
    }
  }