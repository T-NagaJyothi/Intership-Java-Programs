import java.util.Scanner;
class WordCount
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          System.out.println(str1[i]+" "+str1[i].length());
        }
    }
  }