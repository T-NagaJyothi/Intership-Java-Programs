import java.util.Scanner;
class Deletion
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the position to delete");
      int pos=sc.nextInt();
      System.out.println("the array elements after deletion");
      for(int i=pos;i<n-1;i++)
        {
          a[i]=a[i+1];
        }      
    for(int i=0;i<n;i++)
      {
        System.out.println(a[i]);
      }
    }
  }