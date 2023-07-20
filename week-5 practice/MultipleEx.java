import java.util.Scanner;
class MultipleEx
  {
    public static void main(String[] args)
    {
      int n=20;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num");
      int num=sc.nextInt();
      for(int i=0;i<=n;i++)
        {
          System.out.println(num+"*"+i+"="+(i*num));
        }
      
    }
  }
