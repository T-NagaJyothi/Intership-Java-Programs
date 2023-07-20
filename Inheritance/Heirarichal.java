/*Assignment 3: Hierarchical Inheritance

Create a superclass called "Shape" with the following attributes:
String color
double radius
double length
double width*/
class Shape
  {  
    double length=23.6;
    double width=34.8;
    void shape()
    {
    String color="white";
    System.out.println("the color of the object is"+color);
  }
  }
class Radius extends Shape
  {
    void radius()
    {
      double radius=12.34;
      System.out.println("the radius is"+radius);
    }
  }
class Area extends Shape
  {
    void area()
    {
      double areaIs=length*width;
      System.out.println("the area of the rectangle"+areaIs);
    }
  }
class Heirarichal
  {
    public static void main(String[] args)
    {
      Area a=new Area();
      a.area();
      a.shape();
      Radius r=new Radius();
      r.radius();
    }
  }