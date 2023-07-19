//initializing the objects through constructor using array of objects
import java.util.Scanner;
class Employee
  {
    String emp_name;
    String emp_address;
    int emp_id;
    Employee(String n,String a,int id)
    {
      emp_name=n;
      emp_address=a;
      emp_id=id;
    }
    public void display()
    {
      System.out.println("the name of the employee: "+emp_name);
      System.out.println("the address of the employe: "+emp_address);
      System.out.println("the id of the employee: "+emp_id);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      Employee emp[]=new Employee[size];
      for(int i=0;i<size;i++)
        {
      System.out.println("enter the name");
      String name=sc.next();
      System.out.println("enter the address");
      String address=sc.next();
      System.out.println("enter the id");
      int id1=sc.nextInt();
       emp[i]=new Employee(name,address,id1);
    }
     for(int i=0;i<size;i++)
       {
         emp[i].display();
       }
    }
  }