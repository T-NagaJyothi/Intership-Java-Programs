import java.util.Scanner;
class Student1
  {
    String stu_name;
    String stu_grade;
    int stu_rollno;
    Student1(String n,String g,int r)
    {
      stu_name=n;
      stu_grade=g;
      stu_rollno=r;
    }
    public void display()
    {
      System.out.println("the name of the student"+stu_name);
      System.out.println("the grade of the student"+stu_grade);
      System.out.println("the roll no of the student"+stu_rollno);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      Student1 student[]=new Student1[size];
      for(int i=0;i<size;i++)
        {
          System.out.println("enter the student"+(i+1));
          System.out.println("enter the name");
          String name=sc.next();
          System.out.println("enter the grade");
          String grade=sc.next();
          System.out.println("enter the roll no");
          int rollno=sc.nextInt();
          student[i]=new Student1(name,grade,rollno);
        }
        for(int i=0;i<size;i++)
        {
          student[i].display();
        }
    }
  }