import java.util.Scanner;
class SortingArrayMethod
  {
    public static void arraySort(int a[],int size)
    {
      int temp=0;
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("the sorting array elements");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
  public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array element");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      arraySort(a,size);
    }
  }