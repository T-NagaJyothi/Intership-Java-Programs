import java.util.Scanner;
class TwoDArray
  {
    public static void main(String[] args)
    {
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
        System.out.println("the array elements are:");
          for(int i=0;i<row;i++)
            {
              for(int j=0;j<column;j++)
                {
                  System.out.println(a[i][j]+" ");
                }
            System.out.println();
            }
        }
    }
  