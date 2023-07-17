import java.util.Scanner;
class EvenOddArray
  {
    public void evenElements(int array[],int size)
    {
      System.out.println("the even elements in the array");
      for(int i=0;i<size;i++)
        {
          if(array[i]%2==0)
          {
            System.out.println(array[i]+"\t");
          }
        }
    }
      public void oddElements(int array[],int size)
        {
        System.out.println("the odd elements in the array");
        for(int i=0;i<size;i++)
          {
            if(array[i]%2!=0)
            {
              System.out.print(array[i]+"\t");
            }
          }
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
    EvenOddArray s=new EvenOddArray();
    s.evenElements(array, size);
    s.oddElements(array, size);
  }
  }