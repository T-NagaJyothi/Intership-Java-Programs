import java.util.Scanner;
class StudentGrade
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
      if(percentage>=90 && percentage<=100)
      {
        System.out.println("Grade A");
      }
        else if(percentage>=80 && percentage<90)
      {
        System.out.println("Grade B");
      }
        else if(percentage>=70 && percentage<80)
      {
        System.out.println("Grade c");
      }
      else if(percentage>=60 && percentage<70)
      {
        System.out.println("Grade D");
      }
      else if(percentage>=40 && percentage<60)
      {
        System.out.println("Grade E");
      }
else
      {
        System.out.println("fail");
        }
    }
  }