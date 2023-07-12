import java.util.Scanner;
class ArraySum
  {
    public static void main(String[] args)
    {
      int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
    System.out.println("the sum of the array elements"+sum);
    }
  }