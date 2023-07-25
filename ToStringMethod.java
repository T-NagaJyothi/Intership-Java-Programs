class Person
  {
    String emp_name;
    int emp_id;
    int salary;
    String emp_address;
    Person(String emp_name,int emp_id,int salary,String emp_address)
    {
      this.emp_name=emp_name;
      this.emp_id=emp_id;
      this.salary=salary;
      this.emp_address=emp_address;
    }
    public String toString()
    {
      return "employe name:"+emp_name+"\nemploye id:"+emp_id+"\nemployee salary:"+salary+"\nemployee address:"+emp_address;
    }
  }
class ToStringMethod
  {
    public static void main(String[] args)
    {
      Person p1=new Person("john",12,13000,"vijayawada");
      Person p2=new Person("james",13,12000,"vizag");
      System.out.println(p1);
      System.out.println(p2);
    }
  }