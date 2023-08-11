import java.util.Scanner;
class ExampleScanner
  {
    public static void main(String[] args)
    {
      double num1,num2,mul;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      num1=sc.nextDouble();
      System.out.println("enter the second number");
      num2=sc.nextDouble();
      mul=num1*num2;
      System.out.println("multiplication of the two numbers"+mul);
    }
  }