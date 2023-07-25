class Student
  {
    String name;
    int rollno;
    String address;
    public String toString()
    {
      return "name of the student: "+name+"\nrollno is:"+rollno+"\naddress of the student:"+address;
    }
  }
class ToStringEx
{
    public static void main(String[] args)
    {
      Student stu=new Student();
      stu.name="james";
      stu.rollno=123;
      stu.address="vijayawada";
      System.out.println(stu);
    }
  }