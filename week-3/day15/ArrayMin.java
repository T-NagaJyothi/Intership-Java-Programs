import java.util.Scanner;
class ArrayMin
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      inr a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      int min=0;
      for(int i=0;i<size;i++)
        {
          if(a[i]<min)
            min=a[i];
        }
    System.out.println("the minimum element is"+min);
    }
  }