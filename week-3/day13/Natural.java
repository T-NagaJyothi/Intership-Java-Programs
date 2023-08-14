import java.util.Scanner;
class Natural
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the starting value") ;
    int start=sc.nextInt();
    System.out.println("enter the ending number");
    int end=sc.nextInt() ;
      for(int i=start;i<=end;i++)
        {
          System.out.println(i);
        }
    }
  }