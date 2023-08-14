/*Create a Java program that manages an array of Employee objects. Each Employee object should have the following attributes:

employeeId: A unique 4-digit identifier for the employee.
employeeName: The name of the employee (between 3 and 40 characters).
mobileNumber: The employee's mobile number, a 10-digit string that starts with 9, 8, 7, or 6.
salary: The employee's salary, a positive integer not exceeding 1,000,000.
 

The program should allow the user to input data for each employee dynamically with the following validations:

employeeId: Ensure it's a unique 4-digit identifier.
employeeName: Validate that it contains only letters and is between 3 and 40 characters.
mobileNumber: Confirm that it's a 10-digit number starting with 9, 8, 7, or 6.
salary: Validate that it's a positive integer and doesn't exceed 1,000,000.
 

After collecting the data for five employees, display the details for all five employees.

Your program should implement these requirements and ensure that the data collected is accurate and follows the provided validation rules.*/
import java.util.Scanner;
class Employee
  {
   private int emp_id;
   private  String emp_name;
    private  long emp_mobile;
    private int emp_salary;
   public void setEmpid(int emp_id)
    {
      this.emp_id=emp_id;
    }
    public void setEmpname(String emp_name)
    {
      this.emp_name=emp_name;
    }
    public void setEmpmobile(long emp_mobile)
    {
      this.emp_mobile=emp_mobile;
    }
    public void setEmpsalary(int emp_salary)
    {
      this.emp_salary=emp_salary;
    }
      public  int getEmpid()
        {
        return emp_id;
        }
    public String getEmpname()
    {
      return emp_name;
    }
    public long getMobile()
    {
      return emp_mobile;
    }
    public int getSalary()
    {
      return emp_salary;
  }
  }
class Employee1 
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    Employee employee[]=new  Employee[size];
     public void setEmpDetails()
    {
      for(int i=0;i<size;i++)
        {
          employee[i]=new Employee();
          System.out.println("enter the emp"+(i+1)+"details");
          System.out.println("enter emp id");
          int id=sc.nextInt();
          employee[i].setEmpid(id);
          System.out.println("enter the emp name");
          String name=sc.next();
          employee[i].setEmpname(name);
          System.out.println("enter the mobile no");
          long mobile=sc.nextLong();
          employee[i].setEmpmobile(mobile);
          System.out.println("enter the salary");
          int salary=sc.nextInt();
          employee[i].setEmpsalary(salary);
            }
    }
      public void showDetails()
    {
      System.out.println("the employe details");
      for(int i=0;i<size;i++)
        {
          System.out.println(employee[i].getEmpid());
          System.out.println(employee[i].getEmpname());
         System.out.println(employee[i].getMobile());
          System.out.println(employee[i].getSalary());
        }
  }
  void validateMobile()
        {
          long mobile;
         String str=String.valueOf(mobile); 
      if((str.length()==10) && str.startsWith("9")||str.startsWith("8")||str.startsWith("7")||str.startsWith("6"))
        {
        System.out.println("mobile no is valid");
        }
        else
      {
        System.out.println("no is not valid");
      }
    }
}
class EmployeDetails 
  {
    public static void main(String[] args)
    {
      Employee1 emp=new Employee1();
      emp.setEmpDetails();
      emp.showDetails();
      emp.validateMobile();
    }
  }