import java.util.Scanner;
class ArraySum
  {
    public void sumArray()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
       System.out.println("the sum of array elemnts are");
      int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+array[i];
        }
      System.out.println(sum+"");
    }
    public static void main(String[] args)
    {
      ArraySum s=new ArraySum();
      s.sumArray();
    }
  }