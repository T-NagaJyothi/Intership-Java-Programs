//sum of first n natural numbers
import java.util.Scanner;
class SumN
  {
    public static void main(String[] args)
    {
      int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num");
      int num=sc.nextInt();
      for(int i=0;i<=num;i++)
        {
          System.out.println(i);
          sum=sum+i;
        }
    System.out.println("sum of n nos\t"+sum);
    }
  }