class Sample
  {
    public void addition()
    {
      int a=12,b=12,add=a+b;
      System.out.println("addition"+add);
    }
    public void subtract()
    {
      int c=20,d=12,sub=c-d;
      System.out.println("subtraction"+sub);
    }
    public void multiply()
    {
      int e=20,f=30,mul=e*f;
      System.out.println("multiplication"+mul);
    }
  }
class AddSubMul
  {
    public static void main(String[] args)
    {
      Sample s=new Sample();
      s.addition();
      s.subtract();
      s.multiply();
    }
  }