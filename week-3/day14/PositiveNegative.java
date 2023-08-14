import java.util.Scanner;
class PositiveNegative
  {
    public static void positiveNegative(int num)
    {
      if(num>=0)
        System.out.println("positive number");
      else
        System.out.println("negative number");
       }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num value");
      int num=sc.nextInt();
      positiveNegative(num);
    }
  }