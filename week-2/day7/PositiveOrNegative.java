import  java.util.Scanner;
class PositiveOrNegative
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the  num");
      int num1=sc.nextInt();
      if(num1>=0)
        System.out.println("print the  num is positive");
      else
        System.out.println("print the num is negative");
    }
  }