class GrandFather
  {
    void property()
    {
      System.out.println("grandfather have some properties");
    }
  }
class Father extends GrandFather
{
  public void house()
  {
    System.out.println("Father have house property ");
  }
}
class Daughter extends Father
  {
    void gold()
    {
      System.out.println("daughter have the gold from the fathers property");
    }
  }
class Son extends Father
  {
    void home()
    {
      System.out.println("son have the house from the fathers properties");
    }
  }
class HybridInheritance
  {
    public static void main(String[] args)
    {
      Father f=new Father();
      f.property();
      Son s=new Son();
      s.home();
      s.house();
      Daughter d=new Daughter();
      d.gold();
    }
  }