import java.util.Scanner;
class AlphabetDigitSpecial
  {
    public static void main(final String[] args)
    {
      final Scanner sc=new Scanner(System.in);
      System.out.println("enter the character");
      char ch=sc.next().charAt(0);
      if(ch>='a' && ch<='z'||ch>='A'&& ch<='Z')
      {
        System.out.println("It is a alphabet");
          }
          else if(ch>='0'&& ch<='9')
          {
            System.out.println("it is digit");
          } 
          else
          {
            System.out.println("it is special character");
          }
    }
  }
        