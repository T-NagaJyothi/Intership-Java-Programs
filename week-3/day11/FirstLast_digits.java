import java.util.Scanner;
class FirstLast_digits
  {
    public static void main(String[] args)
    {
      int firstdigit=0;
      int lastdigit;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int temp=num;
      lastdigit=temp%10;
      while(num!=0)
        {
          firstdigit=num%10;
          num=num/10;
        }
      System.out.println("first digit is"+firstdigit);
   System.out.println("last digit is"+lastdigit);
  }
  }