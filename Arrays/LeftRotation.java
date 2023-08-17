import java.util.Scanner;
class LeftRotation
  {
    public static void main(String[] args)
    {
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
  System.out.println("enter the array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
      }
    System.out.println("enter the position value how many you want to shift");
     int num=sc.nextInt();
      System.out.println("before performing left rotation");
      for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
   for(int i=0;i<a.length-1;i++)
     {
       int temp=a[0];
       for(int j=0;j<a.length-1;j++)
         {
           a[j]=a[j+1];
         }
    a[a.length-1]=temp;
     }
    System.out.println("after left rotation");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]);
        }
    }
  }