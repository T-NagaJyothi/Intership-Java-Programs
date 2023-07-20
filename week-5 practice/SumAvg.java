import java.util.Scanner;
class SumAvg
  {
    public static void main(String[] args)
    {
      int sum;
      float avg;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter num1");
      int num1=sc.nextInt();
      System.out.println("enter num2");
      int num2=sc.nextInt();
      System.out.println("enter num3");
      int num3=sc.nextInt();
      System.out.println("enter num4");
      int num4=sc.nextInt();
      System.out.println("enter num5");
      int num5=sc.nextInt();
      sum=num1+num2+num3+num4+num5;
      System.out.println("the sum of five numbers"+sum);
      avg=sum/5;
      System.out.println("the average of five numbers"+avg);
    }
  }