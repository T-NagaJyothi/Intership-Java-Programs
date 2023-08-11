import java.util.Scanner;
class Multiple5_11
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num");
      int num=sc.nextInt();
      if(num%5==0 && num%11==0)
        System.out.println("number is divisible by 5 & 11");
      else
        System.out.println("number is not divisible by 5 & 11");
    }
  }