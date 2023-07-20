class Bird
  {
    public void fly()
    {
      System.out.println("birds are flying");
    }
  }
    class Parrot extends Bird
    {
      public void feather()
      {
        System.out.println("birds have feather");
      }
    }
    class Pigeon extends Parrot
    {
      public void layingEggs()
      {
        System.out.println("birds laying eggs ");
      }
    }
    class MultiLevelInheritance
      {
        public static void main(String[] args)
        {
          Pigeon p=new Pigeon();
          p.layingEggs();
          p.feather();
          p.fly();
        }
      }