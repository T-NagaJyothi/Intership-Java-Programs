import java.util.Scanner;
class ArrayDuplicateValue
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
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
          System.out.println("the duplicate value :"+a[i]);
        }
    }
  }
  }