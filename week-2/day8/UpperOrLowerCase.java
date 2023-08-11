import java.util.Scanner;
class UpperOrLowerCase
  {
    public static void main(final String[] args)
    {
      final Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      char ch=sc.next().charAt(0);
      if(ch>='a' && ch<='z')
        System.out.println("It is a lower case");
          else if(ch>='A'&& ch<='Z')
            System.out.println("it is a uppercase");
    }
  }