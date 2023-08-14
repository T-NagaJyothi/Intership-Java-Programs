import java.util.Scanner;
class ReverseOfString
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.next();
      String revs="";
      for(int i=str.length()-1;i>=0;i++)
        {
          revs=revs+str.charAt(i);
        }
    System.out.println("the reverse of the given string"+revs);
    }
  }