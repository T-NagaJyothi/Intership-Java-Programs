import java.util.Scanner;
class ArrayInsert
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n+1];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the value to insert");
      int ele=sc.nextInt();
      System.out.println("enter the index position");
      int pos=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          if(i==pos)
          {
            b[i]=ele;
          }
          else if(i>pos)
          {
            b[i]=a[i-1];
          }
         else {
           b[i]=a[i];
         }
        }
        System.out.println("after insertion");
          for(int i=0;i<n;i++)
            {
              System.out.println(b[i]);
            }
          }  
    }