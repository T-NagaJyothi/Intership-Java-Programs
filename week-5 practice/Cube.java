//Write a Java program to display the cube of the given number up to an integer.
import java.util.Scanner;
class Cube
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number num ");
      int num=sc.nextInt();
      for(int i=0;i<=num;i++)
        {
          System.out.println("cube of "+i+"is\n"+(i*i*i));
        }
    }
  }