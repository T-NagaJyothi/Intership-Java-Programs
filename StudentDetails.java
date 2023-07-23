class Person
  {
    String name="james";
    int rollno=123;
    void display()
    {
      System.out.println("name: "+name+" rollno: "+rollno);
    }
 }
class Student extends Person
{
  String branch="MCA";
  String grade="A";
  void display()
  {
    super.display();
    System.out.println("branch: "+branch+" grade: "+grade);
    
  }
}
class StudentDetails
  {
    public static void main(String[] args)
    {
      Student sc=new Student();
      sc.display();
    }
  }