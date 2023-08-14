import java.util.Scanner;
class StudentDetails4
  {
    public static void studentDetails(String name,int rollno,char section,int marks)
    {
      System.out.println("name is"+name+"\n rollno is"+rollno+"\n section "+section+"\n marks are"+marks);
    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter name");
    String  name=sc.next();
      System.out.println("enter the roll number");
    int  rollno=sc.nextInt();
      System.out.println("enter the section");
     char section=sc.next().charAt(0);
      System.out.println("enter the marks");
   int   marks=sc.nextInt();
      studentDetails(name,rollno,section,marks);
    }
  }