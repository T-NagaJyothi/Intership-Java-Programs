import java.util.Scanner;
class MatrixAddition
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first matrix row size");
      int row1=sc.nextInt();
      System.out.println("enter the first matrix column size");
      int column1=sc.nextInt();
      System.out.println("enter the second matrix row size");
      int row2=sc.nextInt();
      System.out.println("enter the second matrix column size");
      int column2=sc.nextInt();
      System.out.println("enter the first matrix elemnts");
      int matrix1[][]=new int[row1][column1];
      for(int i=0;i<row1;i++)
        {
          for(int j=0;j<column1;j++)
            {
              matrix1[i][j]=sc.nextInt();
           }
        }
    System.out.println("the first matrix elements are");
      for(int i=0;i<row1;i++)
        {
          for(int j=0;j<column1;j++)
            {
              System.out.println(matrix1[i][j]);
            }
       }
    System.out.println("enter the second matrix elements");
      int matrix2[][]=new int[row2][column2];
      for(int i=0;i<row2;i++)
        {
          for(int j=0;j<column2;j++)
            {
              matrix2[i][j]=sc.nextInt();
            }
        }
   System.out.println("the second matrix elements are");
          for(int i=0;i<row2;i++)
            {
              for(int j=0;j<column2;j++)
                {
                  System.out.println(matrix2[i][j]);
                }
            }
       if(row1==row2 && column1==column2)
       {
         int result[][]=new int[row2][column2];
         for(int i=0;i<row1;i++)
           {
             for(int j=0;j<column2;j++)
               {
                 for(int k=0;k<column1;k++)
                   {
                     result[i][j]=matrix1[i][j]+matrix2[i][j];
                   }
               }
           }
        System.out.println("the matrix addition is");
             for(int i=0;i<row1;i++)
               {
                 for(int j=0;j<column2;j++)
                   {
                     System.out.println(result[i][j]);
                   }
               }
          
           }
       
       }
     }
    