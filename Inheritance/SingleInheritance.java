class Bird
  {
  public  void fly()
    {
      System.out.println("flying");
    }
  }
    class Parrot extends Bird
      {
      public  void wings()
        {
          System.out.println("birds have wings for flying");
        }
      }
    class SingleInheritance
      {
        public static void main(String[] args)
        {
          Parrot1 p=new Parrot1();
          p.fly();
          p.wings();
        }
      }