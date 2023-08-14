import java.util.Scanner;
class Average
  {
    public static void avg(double num1,double num2,double num3)
    {
      double average=(num1+num2+num3)/3;
      System.out.println("average of three "+average);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter num1");
      double num1=sc.nextDouble();
      System.out.println("enter num2");
      double num2=sc.nextDouble();
      System.out.println("enter the num3");
      double num3=sc.nextDouble();
      avg(num1,num2,num3);
    }
  }