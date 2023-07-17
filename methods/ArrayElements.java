import java.util.Scanner;
class ArrayElements
  {
    public void arrayElements()
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
      System.out.println("the array elements are:");
    for(int i=0;i<size;i++)
      {
        System.out.print(array[i]+"\t");
      }
    System.out.println("");
    }
public static void main(String[] args)
  {
  ArrayElements arr=new ArrayElements();
    arr.arrayElements();
  }
  }