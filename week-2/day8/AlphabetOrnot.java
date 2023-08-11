import java.util.Scanner;
class AlphabetOrnot
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the alphabet");
      char ch=sc.next().charAt(0);
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        System.out.println("the character is alphabet");
      else 
      System.out.println("the character is not alphabet");
    }
  }