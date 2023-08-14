import java.util.Scanner;
class AreaOfSqCirRec
  {
    public static void areaOfCircle(double pi,double r)
    {
     double area=pi*r*r;
      System.out.println("area of square"+area);
    }
    public static void areaOfSquare(double side)
    {
      double area=side*side;
      System.out.println("area of square"+area);
    }
    public static void areaOfRectangle(double length,double breadth)
    {
      double area=length*breadth;
      System.out.println("area of rectangle"+area);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the pi ");
      double pi=sc.nextDouble();
      System.out.println("enter the radious");
      double r=sc.nextDouble();
      System.out.println("enter the  side");
      double side=sc.nextDouble();
      System.out.println("enter the length");
      double length=sc.nextDouble();
      System.out.println("enter the breadth");
      double breadth=sc.nextDouble();
      areaOfCircle(pi,r);
      areaOfSquare(side);
      areaOfRectangle(length,breadth);
    }
    }