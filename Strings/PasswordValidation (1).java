import java.util.Scanner;
class PasswordValidation
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
System.out.println("enter the desired password");
  String password=sc.nextLine();
  int upper=0;
  int alpha=0;
  int digit=0;
   int special=0;
    for(int i=0;i<password.length();i++) 
      {
        char ch=password.charAt(i);
        if(password.length()>=8)
        {
          if(ch>='A' && ch<='Z')
          {
            upper++;
          }
       if(ch>='a' && ch<='z')
       {
         alpha++;
       }
      if(ch>='0' && ch<='9')
      {
        digit++;
      }
       else
      {
        special++;
      }
        }
      }
 if(upper>0 && alpha>0 && digit>0 && special>0)
{
  System.out.println("password validation");
}
else
{
  System.out.println("it is a invalidate");
}
}
}