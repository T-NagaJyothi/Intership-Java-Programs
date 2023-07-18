/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
class BookDetails
  {
    String bookTitle;
    int year;
    String authorName;
    public void intializeBook(String b,int y,String a)
    {
    bookTitle=b;
    year=y;
      authorName=a;  
    }
    public void display()
    {
      System.out.println("the name of the book"+bookTitle);
      System.out.println("the year of book publishing"+year);
      System.out.println("the author of book"+authorName);
    }
    public static void main(String[] args)
    {
      BookDetails b=new BookDetails();
      b.intializeBook("book1",2001,"author1");
      b.display();
    }
  }