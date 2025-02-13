import java.util.Scanner;
class BookDetails
  {
    String book_name;
    String author_name;
    int publishing_year;
    String book_id;
    public void display()
    {
      System.out.println("book name:"+book_name+"author name"+author_name+"publishing_year"+publishing_year+"book reference id"+book_id);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      BookDetails book[]=new BookDetails[size];
      for(int i=0;i<size;i++)
        {
          book[i]=new BookDetails();
          System.out.println("enter the book"+(i+1)+"details");
          System.out.println("enter the book name");
          book[i].book_name=sc.next();
          System.out.println("enter the author name");
          book[i].author_name=sc.next();
          System.out.println("enter the publishing year");
          book[i].publishing_year=sc.nextInt();
          System.out.println("enter the book reference id");
          book[i].book_id=sc.next();
        }
      for(int i=0;i<size;i++)
        {
          book[i].display();
        }
    }
  }
