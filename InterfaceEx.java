interface Calculator
  {
    void addition(int a,int b);
    void subtraction(int a,int b);
    void multiplication(int a,int b);
    void division(int a,int b);
  }
class Arithmetic implements Calculator
{
  public void addition(int a,int b)
  {
    System.out.println(a+b);
  }
  public void subtraction(int a,int b)
  {
    System.out.println(a-b);
  }
  public void multiplication(int a,int b)
  {
    System.out.println(a*b);
  }
  public void division(int a,int b)
  {
    System.out.println(a/b);
  }
}
class InterfaceEx
  {
    public static void main(String[] args)
    {
      Arithmetic ar=new Arithmetic();
      ar.addition(10,20);
      ar.subtraction(12,34);
      ar.multiplication(2,4);
      ar.division(4,2);
    }
  }