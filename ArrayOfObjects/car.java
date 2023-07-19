import java.util.Scanner;
class Car
  {
    String make;
    String model;
    int year;
    Car(String m1,String m2,int y)
    {
      make=m1;
      model=m2;
      year=y;
    }
    public void display()
    {
      System.out.println("the car company"+make);
      System.out.println("the car model:"+model);
      System.out.println("the launching year"+year);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      Car car[]=new Car[size];
      for(int i=0;i<size;i++)
        {
          System.out.println("enter the car name");
          String name1=sc.nextLine();
          System.out.println("enter the car model");
          String model1=sc.nextLine();
          System.out.println("enter the car launching year");
          int year1=sc.nextInt();
          car[i]=new Car(name1,model1,year1);
        }
      for(int i=0;i<size;i++)
        {
          car[i].display();
        }
    }
  }