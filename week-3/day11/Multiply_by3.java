import java.util.Scanner;
class Multiply_by3
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n value");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          if(i%3==0)
          {
            System.out.println(i);
          }
        }
    }
  }
  