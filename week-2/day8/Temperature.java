import java.util.Scanner;
class Temperature
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the temperature in celsius or fahrenheat");
      char ch=sc.next().charAt(0);
      if(ch=='c' || ch=='C')
      {
    System.out.println("celsius temperature is entered");
double c=sc.nextDouble();
 double f=(c * (9/5) )+32;
System.out.println("celsius temperature is converted to fahrenheat temperature"+f);
      }
      else if(ch=='f'  || ch=='F')
      {
        System.out.println("fahrenheat temperature is entered");
    double f=sc.nextDouble();
    double c=(f - 32) * 5/9;
      System.out.println("fahrenheat temperature is converted to celsius"+c);
  }
  else
      {
        System.out.println("enter the temperature either in celsius or in fahrenheat");
      }
    }
  }