import java.util.Scanner;
class AlpabetsDigitsSpecial
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      int digits=0;
      int alphabets=0;
      int special=0;
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
          {
            alphabets++;
          }
      else if(ch>='0' && ch<='9')
      {
        digits++;
      }
       else{
         special++;
       }
     }
   System.out.println("the alphabets count is"+alphabets);
      System.out.println("the digits count is"+digits);
      System.out.println("the special characters count is"+special);
    }
  }