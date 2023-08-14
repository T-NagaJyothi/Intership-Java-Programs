import java.util.Scanner;
class ArrayOdd
  {
    public static void arrayElement(int a[])
    {
      System.out.println("the odd numbers are");
      for(int i=0;i<a.length;i++)
        {
        if(a[i]%2!=0)
        {
          System.out.println(a[i]);
        }
        }
    }
   public static void main(String[] args)
     {
     int a[]=new int[5];
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the array elements");
     for(int i=0;i<a.length;i++) 
       {
         a[i]=sc.nextInt();
       }
     arrayElement(a);
    }
  }