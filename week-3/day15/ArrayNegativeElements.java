import java.util.Scanner;
class ArrayNegativeElements
  {
    public static void main(String[] args)
    {
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the negative values are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }