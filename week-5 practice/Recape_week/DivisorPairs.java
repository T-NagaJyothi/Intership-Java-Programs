import java.util.Scanner;
class DivisorPairs
  {
    public static void main(String[] args)
    {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("enter the divisor");
      int divisor=sc.nextInt();
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
    for(int i=0;i<size;i++)
      {
        for(int j=i+1;j<size;j++)
          {
            if((array[i]+array[j])%divisor==0)
            {
              if(i<j)
                count++;
            }
          }
      }
    System.out.println("the total "+count);
    }
  }