import java.util.Scanner;
class CountNegativeValues
  {
    public static void arrayElement(int a[])
    {
                int count=0;
      System.out.println("the negative elements are:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
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