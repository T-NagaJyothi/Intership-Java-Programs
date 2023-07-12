import java.util.Scanner;
class Frequency
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      boolean b[]=new boolean[n+1];
      int count=1;
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
            if(a[i]==a[j]){
              count=count+1;
              
      }
    System.out.println("the frequency of "+a[i]+"---->"+count);
            }
            }
  }
  }