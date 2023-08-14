import java.util.Scanner;
class Sum_digits
  {
    public static void main(String[] args)
{
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  int n=sc.nextInt();
  while(n>0)
    {
      int digit=n%10;
      System.out.println(digit);
       sum=sum+digit;
      n=n/10;
    }
      System.out.println(sum);
    }
  }
  