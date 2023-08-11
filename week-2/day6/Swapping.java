import java.util.Scanner;
class Swapping
{
  public static void main(String[] arga)
  {
    int num1,num2,temp;
    System.out.println("Before swapping ");
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the num1");
    num1=sc.nextInt();
    System.out.println("enter the num2");
num2=sc.nextInt();
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("after swapping ");
    System.out.println("num1 is"+num1);
    System.out.println("num2 is "+num2);


  }
}
