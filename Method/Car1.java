/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
class Car1
  {
    String make;
    String model;
    int year;
    public void setCarDetail(String m,String m1,int y)
    {
      make=m;
     model=m1;
    year=y;
    }
    public void display()
    {
      System.out.println("the company of the car:"+make);
      System.out.println("the model of the car:"+model);
      System.out.println("the lunching year of the car:"+year);
    }
    public static void main(String[] args)
    {
      Car1 car=new Car1();
      car.setCarDetail("tata","nexon",2023);
      car.display();
    }
  }