import java.util.Scanner;
class EmailValidation
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the mail id");
      String mailid=sc.nextLine();
      int alpha=0;
      int digit=0;
      int at=0;
      int dot=0;
      for(int i=0;i<mailid.length();i++)
        {
          char ch=mailid.charAt(i);
          if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
          {
            alpha++;
          }
        if(ch>='0' && ch<='9')
        {
          digit++;
        }
       if(ch=='@')
       {
         at++;
       }
     if(ch=='.')
     {
       dot++;
     }
        }
    if(alpha>0 && digit>0 && at==1 && dot==1)
    {
      System.out.println("the email id is valid");
    }
   else{
     System.out.println("the emailid is invalid");
   }
    }
  }