import java.util.Scanner;
class StudentDetails2
  {
    public static void main(String[] args)
    {
      String name;
      String address;
      long mobileno;
      boolean maritalstatus;
      int marks;
      double percentage;
      char grade;
      System.out.println("enter the student details");
      Scanner sc=new Scanner(System.in);
      System.out.println("name=");
      name=sc.next();
      System.out.println("adress=");
      address=sc.next();
      System.out.println("mobileno");
      mobileno=sc.nextLong();
      System.out.println("maritalstatus");
      maritalstatus=sc.nextBoolean();
      System.out.println("marks");
      marks=sc.nextInt();
      System.out.println("percentage");
      percentage=sc.nextDouble();
      System.out.println("enter the grade");
      grade=sc.next().charAt(0);
    }
  }