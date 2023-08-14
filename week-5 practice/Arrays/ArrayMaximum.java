import java.util.Scanner;
class ArrayMaximum
  {
    public static void main(String[] args)
    {
      int max=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array length");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
    System.out.println("the maximum element of array");
      for(int i=0;i<n;i++)
        {
          if(a[i]>max)
          max=a[i];
        }
            System.out.println(max);
          }
        }