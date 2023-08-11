import java.util.Scanner;
class EvenOrOdd
  {
    public static void main(String[] args)
    {
      int num1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num1");
      num1=sc.nextInt();
      if(num1%2==0)
        System.out.println("the num is even");
       else
         System.out.println("the num is odd");    
    }
  }

