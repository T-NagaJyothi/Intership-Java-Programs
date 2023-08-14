import java.util.Scanner;
class PasswordGenerator
  {
    public static void passWord(char password)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the password");
      password=sc.next();
          if(password>='0' && password<='9' && password>='a' && password<='z')
          {
            if(password>='a' && password<='Z')
          {
            System.out.println("it is a strong password");
            break;
          }
        }
          else
      {
            System.out.println("it is not a strong password");
          System.out.println("do you want to create the password again");
      }
	}
	public static void main(String[] args)
        {
        System.out.println(" the password is");
        passWord(password);
        }
  }