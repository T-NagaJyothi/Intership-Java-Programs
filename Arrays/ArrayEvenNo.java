import java.util.Scanner;
class ArrayEvenNo
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array length");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the even numbers in the array");
      for(int i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }