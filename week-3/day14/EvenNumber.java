import java.util.Scanner;
class EvenNumber
  {
    public static void evenNumber(int num)
    {
      if(num%2==0)
      System.out.println("even number");
      else
      System.out.println("not even");
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num");
      int num=sc.nextInt();
      evenNumber(num);
    }
  }