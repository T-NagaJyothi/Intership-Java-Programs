import java.util.Scanner;
class Student
  {
    private int rollno;
    private String name;
    private String address;
    public void setRollno(int rollno)
    {
      this.rollno=rollno;
    }
    public int getRollno()
    {
      return this.rollno;
    }
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return this.name;
    }
    public void setAddress(String address)
    {
      this.address=address;
    }
    public String getAddress()
    {
      return this.address;
    }
  }
class StudentDetails
  {
    Scanner sc=new Scanner(System.in);
    int size=2;
    Student student[]=new Student[size];
    public void createStudent()
    {
      for(int i=0;i<size;i++)
        {
          student[i]=new Student();
          System.out.println("enter the rollno");
          int rollno1=sc.nextInt();
          student[i].setRollno(rollno1);
          System.out.println("enter the name ");
          String name1=sc.next();
          student[i].setName(name1);
          System.out.println("enter the address");
          String address1=sc.next(); 
          student[i].setAddress(address1);
        }
    }
    public void display()
    {
      for(int i=0;i<size;i++)
        {
          System.out.println("the student roll no :"+student[i].getRollno());
          System.out.println("name is :"+student[i].getName());
          System.out.println("address is :"+student[i].getAddress());
        }
    }
    public void updateByRollno(int rollno)
    {
      for(int i=0;i<size;i++)
        {
          if(rollno==student[i].getRollno())
          {
            String address2=sc.next();
            student[i].setAddress(address2);
            System.out.println("student address is updated");
            display();
          }
        }
    }
  }
class StudentManagement
  {
    public static void main(String[] args)
    {
      StudentDetails stu=new StudentDetails();
      do
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number from 1 to 4");
        System.out.println("1.Student data create");
        System.out.println("2.Display the student details");
        System.out.println("3.update the address by using roll no");
        System.out.println("4.exit");
        System.out.println("enter the number");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              stu.createStudent();
              break;
            case 2:
              stu.display();
              break;
            case 3:
              System.out.println("enter the rollno to update the address");
              int rollno=sc.nextInt();
              stu.updateByRollno(rollno);
              break;
            case 4:
              System.out.println("exiting....");
              System.exit(0);
          }
      }while(true);
    }
  }