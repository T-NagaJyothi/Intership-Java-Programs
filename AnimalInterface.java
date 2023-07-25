/*Assignment 2: Animal Interface Create an interface called Animal with the following methods:
sound(): Abstract method that returns a String representing the sound the animal makes.
eat(String food): Abstract method that takes a String parameter food representing the food the animal eats.
Now, create classes Dog, Cat, and Duck, implementing the Animal interface. Write appropriate code for each animal's sound and eating habit*/
interface Animal
  {
    public String sound();
    public void eat(String food);
  }
class Dog implements Animal
{
  String dogsound;
  public Dog(String dogsound)
  {
    this.dogsound=dogsound;
  }
  public String sound()
  {
    return dogsound;
  }
  public void eat(String food)
  {
    System.out.println("dog eating the food:"+food);
  }
}
class Cat implements Animal
  {
    String catsound;
    Cat(String catsound)
    {
      this.catsound=catsound;
    }
    public String sound()
    {
      return catsound;
    }
    public void eat(String food)
    {
      System.out.println("cat eating food:"+food);
    }
  }
class Duck implements Animal
  {
    String ducksound;
    Duck(String ducksound)
    {
      this.ducksound=ducksound;
    }
    public String sound()
    {
      return ducksound;
    }
    public void eat(String food)
    {
      System.out.println("duck eating food: "+food);
    }
  }
class AnimalInterface
  {
    public static void main(String[] args)
    {
      Dog d=new Dog("bow bow");
      String s1=d.sound();
      System.out.println("dog sounds"+s1);
      d.eat("pedigry");
      Cat c=new Cat("meow meow");
      String s2=c.sound();
      System.out.println("cat sounds"+s2);
      c.eat("milk");
      Duck du=new Duck("quack quack");
      String s3=du.sound();
      System.out.println("duck sounds"+s3);
      d.eat("seeds");
    }
  }