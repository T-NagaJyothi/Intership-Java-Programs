/*Create a base class called Animal with a method make_sound that prints a generic sound made by an animal. Create two derived classes, Dog and Cat, that override the make_sound method to print "Woof" and "Meow" respectively.*/
class Animal
  {
    void makeSound()
    {
      System.out.println("different types of animals sounds ");
    }
  }
class Dog extends Animal
  {
    void makeSound()
    {
      System.out.println("dog sounds like a bow bow");
    }
  }
class Cat extends Animal
  {
    void makeSound()
    {
      System.out.println("cat sounds like a meow meow");
    }
  }
class AnimalEx
  {
    public static void main(String[] args)
    {
      Animal an=new Animal();
      an.makeSound();
      Animal dog=new Dog();
      dog.makeSound();
      Animal cat=new Cat();
      cat.makeSound();
    }
  }