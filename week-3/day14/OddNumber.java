import java.util.Scanner;
class OddNumber
  {
    public static void oddNumber(int num)
    {
      if(num%2!=0)
        System.out.println("odd number");
      else
        System.out.println("not a number");
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      oddNumber(num);
    }
  }