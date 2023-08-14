import java.util.Scanner;
class Palindrome
  {
    public static void palindrome(String str,String str1[])
    {
      for(int i=0;i<str1.length;i++)
        {
          String temp=str1[i];
          String revs="";
          for(int j=temp.length()-1;j>=0;j++)
            {
              revs=revs+temp.charAt(j);
            }
          if(temp.equals(revs))
          {
            System.out.println(temp+" ");
          }
        }
    }
public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the word");
  String str=sc.next();
  String str1[]=str.split(" ");
    palindrome(str,str1);
  }
  }