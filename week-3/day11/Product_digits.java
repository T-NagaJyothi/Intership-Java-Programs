import java.util.Scanner;
class Product_digits
  { 
    public static void main(String[] args)
    {
      int mul=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      while(n>0)
        {
          int digit=n%0;
          System.out.println(digit);
          mul=(mul * digit);
          n=n/10;
        }
      System.out.println(mul);
    }
  }