import java.util.Scanner;
class MaxMinArray
  {
    public void maxElement(int array[],int size)
    {
      System.out.println("the maximum element in the array");
      int max=array[0];
      for(int i=0;i<size;i++)
        {
          if(array[i]>max)
            max=array[i];
        }
      System.out.println(max);
    }
    public void minElement(int array[],int size)
    {
      System.out.println("the minimum element in the array");
      int min=array[0];
      for(int i=0;i<size;i++)
        {
          if(array[i]<min)
            min=array[i];
        }
      System.out.println(min);
    }
  public static void main(String[] args)
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
      MaxMinArray s=new MaxMinArray();
      s.maxElement(array, size);
      s.minElement(array,size);
    }
  }
