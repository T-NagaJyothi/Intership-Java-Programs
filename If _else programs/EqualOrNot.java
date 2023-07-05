import java.util.Scanner;
class EqualOrNot
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first num");
      int num1=sc.nextInt();
      System.out.println("enter the second  num");
      int num2=sc.nextInt();
      if(num1==num2)
        System.out.println("the two numbers are equal");
      else
        System.out.println("the two numbers are not equal");
      }
  }