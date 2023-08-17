import java.util.Scanner;
class PalindromeInString
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a word");
      String str=sc.nextLine();
      String revs="";
      for(int i=str.length()-1;i>=0;i--)
        {
          revs=revs+str.charAt(i);
        }
    System.out.println(revs);
      if(str.equals(revs))
      {
        System.out.println("the given word is palindrome");
      }
      else{
      System.out.println("the given word is not a palindrome");
      }
      }
    }