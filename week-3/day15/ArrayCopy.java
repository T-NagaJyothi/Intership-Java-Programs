import java.util.Scanner;
class ArrayCopy
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int a1[]=new int[size];
      int a2[]=new int[size];
      System.out.println("enter the array elements into a1");
      for(int i=0;i<size;i++)
        {
          a1[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
          {
            a2[i]=a1[i];
          }
      System.out.println("elements of original array");
      for(int i=0;i<size;i++)
        {
    System.out.println(a1[i]);
    }
      System.out.println("the copied elements are:");
    for(int i=0;i<size;i++)
  {
    System.out.println(a2[i]);
  }
  }
}