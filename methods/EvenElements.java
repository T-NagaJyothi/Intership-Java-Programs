import java.util.Scanner;
class EvenElements
  {
    public void evenNo()
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
    System.out.println("the even elements");
      for(int i=0;i<size;i++)
        {
          if(array[i]%2==0)
          {
            System.out.print(array[i]+"\t");
          }
        }
    }
    public static void main(String[] args)
    {
      EvenElements s=new EvenElements();
      s.evenNo();
    }
  }