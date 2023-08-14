import java.util.Scanner;
class DoSample
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n value");
      int n=sc.nextInt();
      System.out.println("enter i value");
      int i=sc.nextInt();
      do{
        System.out.println(i);
      i++;
      } while(i<n);
      {
        if(i%2==0)
        {
        System.out.println("even number number");
          }
      else 
      {
        System.out.println("not a even number");
}
      }
    }
  }
  