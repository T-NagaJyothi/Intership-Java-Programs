import java.util.Scanner;
class ArmstrongNo
{
public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number start point");
    int s=sc.nextInt();
    System.out.println("enter the number end point");
    int e=sc.nextInt();
    int result,num1,num2,num3;
    for(int i=s;i<=e;i++)
      {
       int  temp=i;
        num3=temp%10;
        temp=temp/10;
        num2=temp%10;
        temp=temp/10;
        num1=temp%10;
        result=(num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
        if(i==result)
        {
          System.out.println(i);
        }
      }
  }
}