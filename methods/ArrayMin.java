import java.util.Scanner;
class ArrayMin
  {
    public void minArray()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
      System.out.println("the minimum element in the array elements");
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
      ArrayMin s=new ArrayMin();
      s.minArray();
    }
  }