//constructor overload example
class ConstructorOverload
  {
    ConstructorOverload()
    {
      System.out.println("this is a no-args constructor");
    }
    ConstructorOverload(int x)
    {
      System.out.println(x);
    }
    ConstructorOverload(int x,int y)
    {
      System.out.println(x+y);
    }
    public static void main(String[] args)
    {
      ConstructorOverload co1=new ConstructorOverload();
      ConstructorOverload co2=new ConstructorOverload(14);
      ConstructorOverload co3=new ConstructorOverload(23,34);
    }
  }