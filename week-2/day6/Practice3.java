import  java.util.Scanner; 
class Practice3 { 
  public static void main(String args[]) {
int a,b;
    System.out.println("enter the numbers");
Scanner sc=new Scanner(System.in); System.out.println("Enter first number:"); 
a=sc.nextInt(); System.out.println("Enter second number:");
b=sc.nextInt(); System.out.println("a*=b "+(a*=b)); System.out.println("a-=b "+(a-=b)); System.out.println("a/=b "+(a/=b)); System.out.println("a%=b "+(a%=b)); } }