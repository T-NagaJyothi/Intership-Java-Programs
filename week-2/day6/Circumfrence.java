
import java.util.Scanner;
class Circumfrence
  {
    public static void main(String[] args)
    {
      float r,pi;
      System.out.println("Circumfrence of a circle");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the radious value r");
      r=sc.nextFloat();
      System.out.println("enter the pi value");
      pi=sc.nextFloat();
      System.out.println("Circumfrence of a circle"+(2*pi*r));
    }
  }