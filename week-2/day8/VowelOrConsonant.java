import java.util.Scanner;
class VowelOrConsonant
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the alphabet");
      char ch=sc.next().charAt(0);
      if((ch=='a'||ch=='e'|| ch=='i'||ch=='o'|| ch=='u')||(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'))
        System.out.println("the character is a vowel");
     else 
      System.out.println("the character is consonet");
    }
  }