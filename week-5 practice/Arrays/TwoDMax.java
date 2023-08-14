import java.util.Scanner;
class TwoDMax
  {
    public static void main(String[] args)
    {
      int max=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the column size");
      int column=sc.nextInt();
      int a[][]=new int[row][column];
      System.out.println("enter the array elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("the max element of array");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
    if(a[i][j]>max)
      max=a[i][j];
    }
            }
     System.out.println(max);
        }
    }