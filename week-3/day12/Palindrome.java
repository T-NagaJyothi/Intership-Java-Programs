import java.util.Scanner;
class Palindrome
  {
    public static void main(String[] args)
    {
      int res,temp,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number which you want to palindrome");
      int num=sc.nextInt();
      temp=num;
      while(num>0)
        {
          res=num%10;
          sum=(sum*10)+res;
          num=num/10;
        }
      if(temp==sum)
    System.out.println("palindrome number");
      else
        System.out.println("not palindrome");
    }
  }