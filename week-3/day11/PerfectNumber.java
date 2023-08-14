import java.util.Scanner;
class PerfectNumber
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int temp=n;
      int count=0;
      for(int i=1;i<n;i++)
        {
          if(n%i==0)
          {
            count=count+1;
          }
          }
    if(temp==count)
{
  System.out.println("the number is perfect");
}
else 
{
  System.out.println("the number is not a perfect");
}
}
}