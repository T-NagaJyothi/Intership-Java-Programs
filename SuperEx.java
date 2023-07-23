class Animal
  {
    String name="puppy";
    int age=2;
  }
class Dog extends Animal
{
  String name="tom";
  int age=12;
  void display()
  {
    System.out.println("name "+name+" age: "+age);
    System.out.println("name "+super.name+" age: "+super.age);
  }
}
class SuperEx
  {
    public static void main(String[] args)
    {
      Dog dog=new Dog();
      dog.display();
    }
  }