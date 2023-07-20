/*Single Inheritance

Create a superclass called "Animal" with the following attributes:
String name
int age
String breed*/
class Animal
  {
    String name;
    int age;
    String breed;
    void property()
    {
      System.out.println("animals have a diff types of properties");
    }
  }
class Dog extends Animal
  {
    void display()
    {
      System.out.println("the name of the dog:"+name);
      System.out.println("the age of the dog:"+age);
      System.out.println("the breed of the dog:"+breed);
    }
  }
class Single
  {
    public static void main(String[] args)
    {
      Dog d=new Dog();
      d.property();
      d.name="tom";
      d.age=2;
      d.breed="german";
      d.display();
      
    }
  }