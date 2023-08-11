import java.util.Scanner;
class Natural_no
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("natural numbers");
      System.out.println("enter the n value");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          System.out.println(i);
        }
    }
  }