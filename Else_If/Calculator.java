import java.util.Scanner;
class Calculator
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first operend");
      int first=sc.nextInt();
      System.out.println("enter the second operend");
      int second=sc.nextInt();
      System.out.println("enter the operator");
      char operator=sc.next().charAt(0);
      if(operator=='+')
      {
        float addition=first+second;
        System.out.println("addition is "+addition);
      }
      else if(operator=='-')
      {
        float subtraction=first-second;
        System.out.println("subtraction is"+subtraction);
      }
      else if(operator=='*')
      {
        float multiplication=first*second;
        System.out.println("multiplication is"+multiplication);
      }
      else if(operator=='/')
      {
        float division=first/second;
        System.out.println("division is"+division);
      }
 else if(operator=='%')
   {
      float remainder=first%second;
        System.out.println("reaminder is"+remainder);
   }
      else 
      {
      System.out.println("enter the operators +,-,*,/,%");  
}
        
}
  }