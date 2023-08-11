import java.util.Scanner;
class Logical
{
  public static void main(String[] args)
  {
    System.out.println("enter the x value ");
 Scanner s=new Scanner(System.in);
   boolean x=s.nextBoolean();
    System.out.println("enter the y value");
   boolean  y=s.nextBoolean();
    System.out.println(x&&y);
System.out.println(x||y);
System.out.println(!x);
System.out.println(!y);
 } 
}