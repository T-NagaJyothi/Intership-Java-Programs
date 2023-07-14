import java.util.Scanner;
class ArithmeticOperations
  {
  public static void add(double num1,double num2)
    {
      double add=num1+num2;
      System.out.println("addition \t"+add);
    }
    public static void sub(double num1,double num2)
    {
      double sub=num1-num2;
      System.out.println("subtraction \t"+sub);
     }
    public static void mul(double num1,double num2)
    {
      double mul=num1*num2;
      System.out.println("multiplication \t"+mul);
    }
    public static void div(double num1,double num2)
    {
      double div=num1/num2;
      System.out.println("division \t "+div);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num1:");
      double num1=sc.nextDouble();
      System.out.println("enter the num2:");
      double num2=sc.nextDouble();
      add(num1,num2);
      sub(num1,num2);
      mul(num1,num2);
      div(num1,num2);
    }
}