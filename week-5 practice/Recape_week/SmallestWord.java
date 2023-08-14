import java.util.Scanner;
class SmallestWord
  {
    public static void main(String[] args)
    {
      System.out.println("enter the sentence");
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      int small=str1[0].length();
      String str2="";
      for(int i=0;i<str1.length;i++)
        {
          if(small>str1[i].length())
          {
            small=str1[i].length();
            str2=str1[i];
          }
        }
    System.out.println("the smallest word in the sentence"+str2);
    }
  }