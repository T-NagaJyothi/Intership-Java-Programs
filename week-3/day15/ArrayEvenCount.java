import java.util.Scanner;
class ArrayEvenCount
  {
    public static void arrayElement(int a[])
    {
      int count=0;
      System.out.println("the even number count:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            count++;
          }
        }
      System.out.println(count);
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