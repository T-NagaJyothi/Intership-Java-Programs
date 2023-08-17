import java.util.Scanner;
class SplitString
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String str1[]=str.split("");
      int count=0;
      for(int i=0;i<str1.length;i++){
      count++;
  }
 System.out.println(count);
    }
  }