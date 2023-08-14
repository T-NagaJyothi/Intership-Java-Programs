import java.util.Scanner;
class NestedForSample
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value");
      int a=sc.nextInt();
      System.out.println("enter the b value");
      int b=sc.nextInt();
      for(int i=1;i<a;i++)
        {
          for(int j=1;j<b;j++)
            {
              System.out.println("i="+i+"j="+j);
            }
        }
    }
  }