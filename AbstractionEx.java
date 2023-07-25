abstract class Shape
  {
    public void display()
    {
      System.out.println("area of the triangle,square,circle");
    }
    abstract void area(); 
    double area,width=10.6,height=12.6,side=12.2,pi=3.14,r=10;
    }
class Rectangle extends Shape
{
  void area()
  {
    area=width*height;
    System.out.println("area of rectangle"+area);
  }
}
class Square extends Shape
{
  void area()
  {
    area=side*side;
    System.out.println("area of square"+area);
  }
}
class Circle extends Shape
{
  void area()
  {
  area=pi*r*r;
  System.out.println("area of circle"+area);
}
}
class AbstractionEx
  {
    public static void main(String[] args)
    {
      Rectangle rec=new Rectangle();
      rec.display();
      rec.area();
      Square sq=new Square();
      sq.area();
      Circle cr=new Circle();
      cr.area();
    }
  }