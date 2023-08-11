import java.util.Scanner;
class AreaOfCircle
{
  public static void main(String[] args)
  {
    int r;
    double pi=3.14;
    System.out.println("enter the r value");
Scanner sc=new Scanner(System.in);
    r=sc.nextInt();
    System.out.println("the area of circle"+(pi*r*r));
  }
}

