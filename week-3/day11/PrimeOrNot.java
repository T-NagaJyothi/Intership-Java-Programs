import java.util.Scanner;
class PrimeOrNot
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n value");
      int num=sc.nextInt();
      int count=0;
      for(int i=1;i<=num;i++)
        {
          if(num%i==0)
          {
            count++;
          }
        }
          if(count==2)
          {
            System.out.println("the number is prime");
          }
      else
          {
            System.out.println("not a prime");
          }
        }
    }