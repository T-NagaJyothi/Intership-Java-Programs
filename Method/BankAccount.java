/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance*/
class BankAccount
  {
    String name;
    float balance;
    public void initializeAccount(String n,float b)
    {
      name=n;
      balance=b;
    }
    public void display()
    {
      System.out.println("the account holders name"+name);
      System.out.println("the balance amount in the account"+balance);
    }
    public static void main(String[] args)
    {
       BankAccount account1=new  BankAccount();
      account1.initializeAccount("james",120000);
      account1.display();
      BankAccount account2=new  BankAccount();
     account2.initializeAccount("john",130000);
      account2.display();
      BankAccount account3=new  BankAccount();
      account3.initializeAccount("william",140000);
      account3.display();
    }
  }