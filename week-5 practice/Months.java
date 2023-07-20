//write a program to display the days in a month using switch case
import java.util.Scanner;
class Months
  {
    public static void main(String[] args)
    {
      System.out.println("enter the month");
      Scanner sc=new Scanner(System.in);
      String month=sc.nextLine();
      switch (month)
        {
          case "january":
            System.out.println("the month january contains 31 days");
            break;
          case "february":
            System.out.println("the month february contains 28 days");
            break;
          case "march":
            System.out.println("the month march contains 31 days ");
            break;
          case "april":
            System.out.println("the month april contains 30 days");
            break;
          case "may":
            System.out.println("the month may contains 31 days");
            break;
          case "june":
            System.out.println("the month june contains 30 days");
            break;
          case "july":
            System.out.println("the month july contains 31 days");
            break;
          case "august":
            System.out.println("the month august contains 31 days");
            break;
          case "september":
            System.out.println("the month september contains 30 days");
            break;
          case "october":
            System.out.println("the month october contains 31 days");
            break;
          case "november":
            System.out.println("the month november contains 30 dyas");
            break;
          case "december":
            System.out.println("the month december contains 31 days");
            break;
          default :
            System.out.println("enter the correct month");
     }
        
      }
        
    }