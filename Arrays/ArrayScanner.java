import java.util.Scanner;
class ArrayScanner
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array length");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the elements of array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the elements in the array");
        for(int i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
    }
  }