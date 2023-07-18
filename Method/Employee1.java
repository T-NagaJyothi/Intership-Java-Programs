/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details*/
class Employee1
  {
    String name;
    String designation;
    int salary;
    public void setEmployeeDetails(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    public void display()
    {
      System.out.println("the name of the employee:"+name);
      System.out.println("the designation of the employee:"+designation);
      System.out.println("the salary of the employee:"+salary);
    }
    public static void main(String[] args)
    {
      Employee1 emp1=new Employee1();
      emp1.setEmployeeDetails("john","b.tech",25000);
      emp1.display();
      System.out.println("");
      Employee1 emp2=new  Employee1();
      emp2.setEmployeeDetails("james","mtech",30000);
      emp2.display();
    }
  }