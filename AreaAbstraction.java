/*Shape Hierarchy

Create an abstract class called "Shape" that has the following abstract methods:

get_area(): Returns the area of the shape.
get_perimeter(): Returns the perimeter of the shape.

Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.

Write a program to:

Create instances of Circle, Rectangle, and Triangle.
Prompt the user to enter dimensions for each shape.
Calculate and display the area and perimeter of each shape.
*/
import java.util.*;
abstract class Shape
  {
    abstract void  get_area();
    abstract void   get_perimeter();
    double area,perimeter;
    Scanner sc=new Scanner(System.in);
  public void display()
    {
      System.out.println("area of circle,rectangle,traingle");
    }
}
class Circle extends Shape
{
  void get_area()
  {
    System.out.println("enter the pi and r values for circle");
    double pi=sc.nextDouble();
    double r=sc.nextDouble();
    area=pi*r*r;
    System.out.println("area of circle"+area);
  }
  void get_perimeter()
  {
    System.out.println("enter the pi and r values for circle");
    double pi=sc.nextDouble();
    double r=sc.nextDouble();
    perimeter=2*pi*r;
    System.out.println("perimeter of circle"+perimeter);
  }
}
class Rectangle extends Shape
{
  
  void get_area()
  {
    System.out.println("enter the width and length for rectangle");
    double width=sc.nextDouble();
    double length=sc.nextDouble();
    area=width*length;
    System.out.println("area of rectangle"+area);
  }
  void get_perimeter()
  {
    System.out.println("enter the width and length for rectangle");
    double width=sc.nextDouble();
    double length=sc.nextDouble();
    perimeter=2*(length+width);
    System.out.println("perimeter of rectangle"+perimeter);
  }
}
class Triangle extends Shape
{
   void get_area()
  {
   System.out.println("enter the height ,breadth for traiangle");
   double height=sc.nextDouble();
   double breadth=sc.nextDouble();
    area=(height*breadth)/2;
    System.out.println("area of triangle"+area);
  }
  void get_perimeter()
  {
    System.out.println("enter the side of traiangle");
   double side=sc.nextDouble();
    perimeter=side+side+side;
    System.out.println("perimeter of the triangle"+perimeter);
  }
}
class AreaAbstraction
  {
    public static void main(String[] args)
    {
      Circle cr=new Circle();
      cr.get_area();
      cr.get_perimeter();
      Rectangle rc=new Rectangle();
      rc.get_area();
      rc.get_perimeter();
      Triangle tr=new Triangle();
      tr.get_area();
      tr.get_perimeter();
    }
  }