import java.util.Scanner;
class NumCharSpecial
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      int alphabets=0;
      int number=0;
      int special=0;
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
          {
            alphabets=alphabets+1;
          }
          else if(ch>='0' && ch<='9')
          {
            number=number+1;
          }
           else 
          {
           special=special+1;            
}
        }
          System.out.println("the alphabets are"+alphabets);
          System.out.println("the numbers"+number);
          System.out.println("the special charaters are"+special);
        }
    }