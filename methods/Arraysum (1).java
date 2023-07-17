import java.util.Scanner;
class Arraysum
  {
    public void arraySum(int array[],int size)
    {
      System.out.println("the sum of the array elements");
      int sum=0;
      for(int i=0;i<size;i++)
        {
         sum=sum+array[i]; 
        }
      System.out.println(sum);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          array[i]=sc.nextInt();
        }
      Arraysum s=new Arraysum();
      s.arraySum(array,size);
  }
  }