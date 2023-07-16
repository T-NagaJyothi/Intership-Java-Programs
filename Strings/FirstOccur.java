import java.util.Scanner;
class FirstOccur
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
  System.out.println("enter the character value");
  char ch=sc.next().charAt(0);
int str1=str.indexOf(ch);
      System.out.println("the character first occurances"+str1);
    }
  }