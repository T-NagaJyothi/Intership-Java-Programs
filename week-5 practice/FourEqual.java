//Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
import java.util.Scanner;
class FourEqual
  {
    public static void main(String[] args)
    {
      System.out.println("enter the 4 values");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first no");
      int first=sc.nextInt();
      System.out.println("enter the second no");
      int second=sc.nextInt();
      System.out.println("enter the third no");
      int third=sc.nextInt();
      System.out.println("enter the fourth no");
      int fourth=sc.nextInt();
      if(first==second && second==third && third==fourth)
      {
        System.out.println("the four numbers are equal");
      }
    else
      {
        System.out.println("the four numbers are not equal");
      }
    }
  }