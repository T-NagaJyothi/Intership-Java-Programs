import java.util.Scanner;
class CharacterFrequency
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the word");
      String str=sc.next();
      char str1[]=str.toCharArray();
      int count=1;
      for(int i=0;i<str1.length;i++)
        {
          for(int j=i+1;j<str1.length;j++)
            {
              if(str1[i]==str1[j])
              {
                count=count+1;
              }
            }
       System.out.println(count);
        }
    }
  }