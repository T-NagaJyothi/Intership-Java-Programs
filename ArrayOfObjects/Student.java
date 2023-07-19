//initializing the objects through methods in array of objects
import java.util.Scanner;
class Student
  {
    int rollno;
    String name;
    String grade;
     public void studentDetails(int r,String n,String g)
    {
      rollno=r;
      name=n;
      grade=g;
    }
    public void display()
    {
      System.out.println("the roll no of the student"+rollno);
      System.out.println("the name of the student"+name);
      System.out.println("the grade of the "+grade);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      Student student[]=new Student[size];
      for(int i=0;i<size;i++)
        {
          student[i]=new Student();
          System.out.println("enter the "+(i+1)+" student details");
          System.out.println("enter roll no");
          int rollno1=sc.nextInt();
          System.out.println("enter the name");
          String name1=sc.next();
          System.out.println("enter the grade");
          String grade1=sc.next();
          student[i].studentDetails(rollno1,name1,grade1);
        }
      for(int i=0;i<size;i++)
        {
      student[i].display();
        }
    }
  }