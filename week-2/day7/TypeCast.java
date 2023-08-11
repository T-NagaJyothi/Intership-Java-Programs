import java.util.Scanner;

class TypeCast {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the values");
    long num = sc.nextLong();
    int value = (int) num;
    System.out.println(value);
  }
}