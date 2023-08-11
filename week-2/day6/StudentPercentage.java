import java.util.Scanner;
class StudentPercentage
  {
    public static void main(String[] args)
    {
      int telugu,english,maths,science,social;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the telugu marks");
      telugu =sc.nextInt();
      System.out.println("enter the english marks");
       english=sc.nextInt();
      System.out.println("enter the maths marks");
       maths=sc.nextInt();
      System.out.println("enter the sciencemarks");
       science=sc.nextInt();
      System.out.println("enter the  social marks");
     social=sc.nextInt();
   double total=telugu+english+maths+science+social;
      System.out.println("total marks"+total);
  double  percentage=(total/500)*100;
      System.out.println("percentage is"+percentage);
    }
  }