import java.util.Scanner;
class OddorNot
  {
    public static void main(String[] args)
    {
      int num1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num1");
      num1=sc.nextInt();
      if(num1%2!=0)
        System.out.println("the num is odd");
       else
         System.out.println("the num is not odd");     
    }
  }