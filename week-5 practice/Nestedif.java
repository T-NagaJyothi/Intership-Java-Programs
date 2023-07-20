//voter eligibility using nested if
class Nestedif
  {
    public static void main(String[] args)
    {
      String citizen="india";
      int age=18;
      if(citizen=="india")
      {
        if(age>=18)
        {
          System.out.println("eligible for vote");
        }
      else
          System.out.println("not eligible for voting"); 
      }
      }
    }
  }