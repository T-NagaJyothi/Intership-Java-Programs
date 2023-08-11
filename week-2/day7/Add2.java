import java.util.Scanner;
class Add2
  {
    public static void main(String[] args)
    {
      float num1,num2,sum;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      num1=sc.nextFloat();
      System.out.println("enter the second number");
      num2=sc.nextFloat();
      sum=num1+num2;
      System.out.println("sum of the two numbers"+sum);
    }
  }