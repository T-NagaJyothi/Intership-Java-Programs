class Week1
  {
    String name="weekdays";
   public String day="friday"; 
    private int date=5;
  void printing()
    {
      System.out.println("week1 day5");
      System.out.println(date);
    }
  }
class Week2 extends Week1
{
  void display()
  {
    System.out.println(name);
    System.out.println(day);
    //System.out.println(date);
  }
}
class AccessModifiers
  {
    public static void main(String[] args)
    {
      Week2 w=new Week2();
      w.printing();
      w.display();
    }
  }