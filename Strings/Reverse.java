import java.util.Scanner;
class Reverse
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the word");
      String str=sc.next();
      String reverse="";
      for(int i=str.length()-1;i>=0;i--)
        {
         char ch=str.charAt(i);
        reverse=reverse+ch;
        }
      System.out.println("the reverse of the word/t"+reverse);
    }
  }