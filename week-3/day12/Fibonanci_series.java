import java.util.Scanner;
class Fibonanci_series
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int first=0,second=1;
      System.out.println("enter the number");
      int num=sc.nextInt();
      System.out.println(first);
      System.out.println(second);
      for(int i=1;i<num;i++)
        {
          int third=first+second;
          System.out.println(third);
          first=second;
          second=third;
        }
    }
  }