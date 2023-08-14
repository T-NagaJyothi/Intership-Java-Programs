import java.util.Scanner;
class PrintNumbers
  {
    public static void naturalNumbers(int n)
    {
      for(int i=1;i<=n;i++)
        {
          System.out.println(i);
        }
    }
      public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        naturalNumbers(num); 
    }
  }