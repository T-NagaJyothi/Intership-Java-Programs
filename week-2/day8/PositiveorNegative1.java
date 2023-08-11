import  java.util.Scanner;
class PositiveorNegative1
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the  num");
      int num=sc.nextInt();
      if(num>=0)
        System.out.println("print the  num is positive");
      else
        System.out.println("print the num is negative");
    }
  }