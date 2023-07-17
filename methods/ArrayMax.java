import java.util.Scanner;
class ArrayMax
  {
    public void max()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("enter the array elemnts");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
      System.out.println("the minimum element in the array elements");
      int max=array[0];
      for(int i=0;i<size;i++)
        {
          if(array[i]>max)
            max=array[i];
        }
      System.out.println(max);
    }
    public static void main(String[] args)
    {
      ArrayMax s=new ArrayMax();
      s.max();
    }
  }