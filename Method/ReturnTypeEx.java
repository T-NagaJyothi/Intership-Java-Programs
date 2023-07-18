import java.util.Scanner;
class Sample
  {
    public int addition(int num1,int num2)
    {
      int  sum=num1+num2;
      return sum;
    }
    public char alpha(char ch1)
    {
      return ch1;
    }
    public float multiply(float num3,float num4)
    {
      float mul=num3*num4;
    return mul;
    }
  }
class ReturnTypeEx
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num1 and num2 with int type");
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      System.out.println("enter the character");
      char ch1=sc.next().charAt(0);
      System.out.println("enter the num3 and num4 with float type");
      float num3=sc.nextFloat();
      float num4=sc.nextFloat();
       Sample s=new Sample();
      int result1=s.addition(num1,num2);
      System.out.println("addition"+result1);
      char result2=s.alpha(ch1);
      System.out.println("the character"+result2);
      float result3=s.multiply(num3,num4);
      System.out.println("multiplication "+result3);
    }
  }