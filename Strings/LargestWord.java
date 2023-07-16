import java.util.Scanner;
class LargestWord
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      int large=str1[0].length();
      String str2="";
      for(int i=0;i<str1.length;i++)
        {
          if(large<str1[i].length())
          {
            large=str1[i].length();
            str2=str1[i];
          }
        }
      System.out.println("the largest word in the sentence"+str2);
    }
  }