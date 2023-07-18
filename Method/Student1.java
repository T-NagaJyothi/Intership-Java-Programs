/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a method named setStudentDetails that takes arguments for each variable and initializes the object. Display the student's details using a separate method.*/
class Student1
  {
    int rollno;
    String name;
    public void setStudentDetails(int r,String n)
    {
      rollno=r;
      name=n;
    }
    public void display()
    {
      System.out.println("the roll no of the student"+rollno);
      System.out.println("the name of the student"+name);
    }
    public static void main(String[] args)
    {
      Student1 student1=new Student1();
      student1.setStudentDetails(1,"john");
      student1.display();
      Student1 student2=new Student1();
      student2.setStudentDetails(2,"james");
      student2.display();
      Student1 student3=new Student1();
      student3.setStudentDetails(3,"williams");
      student3.display();
  }
  }