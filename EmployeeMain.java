import java.util.Scanner;
class Employee
  {
    int emp_id;
    String emp_name;
    long emp_mobileno;
    int emp_salary;
    void insert(int emp_id,String emp_name,long emp_mobileno,int emp_salary)
    {
      this.emp_id=emp_id;
      this.emp_name=emp_name;
      this.emp_mobileno=emp_mobileno;
      this.emp_salary=emp_salary;
    }
  }
class EmployeeMain
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int size=2;
      Employee employee[]=new Employee[size];
      for(int i=0;i<size;i++)
        {
          int id;
          int count=0;
          while(true)
            {
              id=sc.nextInt();
              if(id<999 && id>=9999)
              {
                System.out.println("id must contains 4 digits");
                count++;
              }
              else{
                boolean isUnique=true;
                for(int j=0;j<i;j++)
                  {
                    if(employee[j].id==id)
                    {
                      System.out.println("employee id must be unique");
                    isUnique=false;
                      count++;
                      break;
                    }
                  }
                if(isUnique)
                {
                  break;
                }
              }
            }
          String name;
          while(true)
            {
              System.out.println("enter the employe name");
              name=sc.next();
              if(name.length()>=4 && name.length()<=40)
              {
                System.out.println("employee name is valid");
                break;
              }
              else
              {
                System.out.println("enter valid name between 4 to 40 characters");
              }
            }
          while(true)
            {
              System.out.println("enter the mobile number");
              long mobile=sc.nextLong();
              String mobileno=Long.toString(mobile);
              if((mobileno.length()==10)&& (mobileno.starsWith("9") || mobileno.starsWith("8") ||mobileno.starsWith("7") ||mobileno.starsWith("6")))
              {
               System.out.println("mobile no is valid");
                break;
              }
              else
              {
                System.out.println("enter a valid number");
              }
            }
          while(true)
            {
              System.out.println("enter the salary");
              int salary=sc.nextInt();
              if(salary>0 && salary<=100000)
              {
                System.out.println("salary is entered ");
                break;
              }
              else
              {
                System.out.println("salary must be greater than 0 and less than 100000");
              }
            }
          employee[i].insert(emp_emp_id,name,emp_mobile,emp_salary);
        }
      System.out.println("displaying details");
      for(Employee emp:employee)
        {
          System.out.println(emp.id);
          System.out.println(emp.name);
          System.out.println(emp.mobile);
          System.out.println(emp.salary);
        }
      sc.close();
    }
  }