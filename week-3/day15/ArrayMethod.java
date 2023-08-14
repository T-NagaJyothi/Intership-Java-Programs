import java.util.Scanner;
class ArrayMethod
  {
    public static void arrayElement(int a[])
    {
    System.out.println("the negative elements are:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]);
          }
        }
    }
      public static void main(String[] args)
        {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(int i=0;i<a.length;i++)
          {
            a[i]=sc.nextInt();
          }
            arrayElement(a);
          }
  }