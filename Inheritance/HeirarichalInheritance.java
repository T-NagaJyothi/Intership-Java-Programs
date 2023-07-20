class Parents
  {
    public void property()
    {
      System.out.println("parents have some properties");
    }
  }
class Daughter extends Parents
   {
   public void color()
     {
       System.out.println("daughter inherits color from their parents");
     }
   }
class Son extends Parents
{
  public void height()
  {
    System.out.println("son inherts height from their parents");
  }
}
class HeirarichalInheritance
  {
    public static void main(String[] args)
    {
      Son s=new Son();
      s.height();
      s.property();
      Daughter d=new Daughter();
      d.color();
      d.property();
    }
  }