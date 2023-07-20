import java.util.Scanner;
class StringEx
  {
    public static void main(String[] args)
    {
      System.out.println("enter the city");
      Scanner sc=new Scanner(System.in);
      String city=sc.nextLine();
      if(city=="vijayawada")
      {
        System.out.println("city is vijayawada");
      }
      else if(city=="delhi")
      {
        System.out.println("city is delhi");
      }
      else if(city=="vizag")
    {
      System.out.println("city is vizag");
    }
    else if(city=="srikakulam")
    {
     System.out.println("city is srikakulam");
    }
    else
    {
      System.out.println("city not found");
    }
    }
  }
