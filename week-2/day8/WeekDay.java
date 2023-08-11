import java.util.Scanner;
class WeekDay
  {
    public static void main(String[] args)
    {
      int weeknum;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the weeknumber");
      weeknum=sc.nextInt();
      if(weeknum==1)
         {
        System.out.println("this is a Monday");
      }
      else if(weeknum==2)
      {
        System.out.println("this is a Tuesday");
      }
         else if(weeknum==3)
         {
      System.out.println("this is a wednesday");
         }
      else if(weeknum==4)
      {
        System.out.println("this is a thursday");
      }
      else if(weeknum==5)
      {
        System.out.println("this is a friday");
      }
      else if(weeknum==6)
      {
        System.out.println("this is a saturday");
      }
      else if(weeknum==7)
      {
        System.out.println("this is a sunday");
      }
  else {
    System.out.println("selesct number from 1 to 7 only");
}
    }
  }