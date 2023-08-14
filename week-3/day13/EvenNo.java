import java.util.Scanner;
class EvenNo
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the starting number");
      int s=sc.nextInt();
      System.out.println("enter the ending number");
      int e=sc.nextInt();
      for(int i=s;i<e;i++)
        {
          if(i%2==0)
          {
            System.out.println(i);
          }
        }
  }
  }