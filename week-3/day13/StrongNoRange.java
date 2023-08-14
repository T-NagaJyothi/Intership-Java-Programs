import java.util.Scanner;
class StrongNoRange
  {
  public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the starting point");
    int start=sc.nextInt();
    System.out.println("enter the ending point");
    int end=sc.nextInt();
      int sum=0;
      System.out.println("enter the num");
      int num=sc.nextInt();
    int temp;
      temp=num;
    for(int i=start;i<end;i++)
      {
        while(num>0)
          {
            int digit=num%10;
            int fact=1;
            for(int j=1;j<=digit;j++)
              {
                fact=fact*j;
              }
            sum=sum+fact;
            num=num/10;
          }
        if(sum==temp)
        {
          System.out.println(sum);
        
      }
    
    }
  }
  }